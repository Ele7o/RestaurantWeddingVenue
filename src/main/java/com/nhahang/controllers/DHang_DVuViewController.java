/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.DonHang_DichVu;
import com.nhahang.service.DonHang_DichVuService;
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
@RequestMapping("/dhdvview")
public class DHang_DVuViewController {
    @Autowired
    private DonHang_DichVuService donHang_dichVuService;
    
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idDonHangDichVu",required = false,defaultValue = "0")String idDonHangDichVu){
        int id = Integer.parseInt(idDonHangDichVu);
        if(id>0){
            model.addAttribute("dhdv2",this.donHang_dichVuService.getDonHang_DichVu(id));
        }
        else{
            model.addAttribute("dhdv2",new DonHang_DichVu());
        }
        return "dhdvview";
    }
    
    @PostMapping("/add")
    public String addDHDichVu(Model model, @ModelAttribute(value="dhdv2")@Valid DonHang_DichVu donHang_dichVu, BindingResult rs){
        if(rs.hasErrors()){
            return "dhdvview";
        }
        if(!this.donHang_dichVuService.addOrUpdateDh_Dv(donHang_dichVu)){
            model.addAttribute("errorMsg","ERROR404");
            return "dhdvview";
        }
        return "redirect:/dhdv/";
    }
    
}
