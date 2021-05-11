/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.KhachHang;
import com.nhahang.service.KhachHangService;
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
@RequestMapping("/KhachHangView")
public class KhachHangViewController {
    @Autowired
    private KhachHangService khachHangService;
    
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idKhachHang",required = false, defaultValue = "0")String idKhachHang){
        int id = Integer.parseInt(idKhachHang);
        if(id>0){
           model.addAttribute("khachhang2", this.khachHangService.getKhachHangById(id));
        }
        else{
            model.addAttribute("khachhang2",new KhachHang());
        }
        return "khachhangview";
    }
    @PostMapping("/add")
    public String addKhachHang(Model model, @ModelAttribute(value= "khachhang2")@Valid KhachHang khachhang, BindingResult rs){
        if(rs.hasErrors()){
            return "khachhangview";
        }
        if(!this.khachHangService.addOrUpdateKhachHang(khachhang)){
            model.addAttribute("errorMsg","ERROR404");
            return "khachhangview";
        }
        return "redirect:/KhachHang/";
    }
}
