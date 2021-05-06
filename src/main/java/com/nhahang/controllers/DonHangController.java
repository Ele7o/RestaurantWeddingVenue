/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.DonHangService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author X_X
 */
@Controller
@ControllerAdvice
@RequestMapping("/DonHang")
public class DonHangController {
    @Autowired
    private DonHangService donHangService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("donhang",this.donHangService.getDonHangs());
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idDonHang",required = false)String idDonHang){
        if(idDonHang == null){
            model.addAttribute("donhang",this.donHangService.getDonHangs());
        }
        else{
            model.addAttribute("donhang",this.donHangService.getDonHangById(Integer.parseInt(idDonHang)));
        }
        return "donhang";
    }
}
