/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.DichVuService;
import com.nhahang.service.DonHangService;
import com.nhahang.service.DonHang_DichVuService;
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
 * @author btson
 */
@Controller
@ControllerAdvice
@RequestMapping("/dhdv")
public class DonHang_DichVuController {
    @Autowired
    private DonHangService donHangService;
    @Autowired
    private DichVuService dichVuService;
    @Autowired
    private DonHang_DichVuService donHang_dichVu;
    
    @ModelAttribute
    public void addAttributes(Model model, HttpSession session){
        model.addAttribute("dhdv",this.donHang_dichVu.getDonHang_DichVus());
        model.addAttribute("donhang4",this.donHangService.getDonHangs());
        model.addAttribute("dichvu3", this.dichVuService.getDichVus());
        
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idDh_Dv",required = false)String idDv_Dh){
        if(idDv_Dh == null){
            model.addAttribute("dhdv",this.donHang_dichVu.getDonHang_DichVus());
        }
        else{
            
            model.addAttribute("dhdv",this.donHangService.getDonHangById(Integer.parseInt(idDv_Dh)).getDonHang_dichVu());
        }
        return "donhang_dichvu";
    }
   
}