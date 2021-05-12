/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.KhachHangService;
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
@RequestMapping("/KhachHang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("khachhang",this.khachHangService.getKhachHang());
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idKhachHang",required = false)String idKhachHang){
        if(idKhachHang == null){
            model.addAttribute("khachhang",this.khachHangService.getKhachHang());
            
        }
        else{
            model.addAttribute("khachhang",this.khachHangService.getKhachHangById(Integer.parseInt(idKhachHang)));
        }
        return "khachhang";
    }
    
    
}
