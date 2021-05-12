/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.DonHang;
import com.nhahang.service.DonHangService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author btson
 */
@Controller
@ControllerAdvice
@RequestMapping("/DonHangView")
public class DonHangViewController {
    @Autowired
    private DonHangService donHangService;
   
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idDonHang",required = false, defaultValue = "0")String idDonHang){
            int id = Integer.parseInt(idDonHang);

           if(id>0){
               model.addAttribute("donhang2",this.donHangService.getDonHangById(id));
           }
           else{
               model.addAttribute("donhang2",new DonHang());
           }
           return "donhangview";
        }

    @PostMapping("/add")
    public String addDonHang(Model model, 
            @ModelAttribute(value="donhang2") @Valid DonHang donHang, 
            BindingResult rs ){
        if(rs.hasErrors()){
            return "donhangview";
        }
        if(!this.donHangService.addOrUpdateDonHang(donHang)){
            model.addAttribute("errorMsg","ERROR404");
            return "donhangview";
        }
        return "redirect:/DonHang/";
    }
}
