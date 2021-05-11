/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.TaiKhoan;
import com.nhahang.service.TaiKhoanService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author X_X
 */
@Controller
@ControllerAdvice
@RequestMapping("/register")
public class DangKiController {
    @Autowired
    private TaiKhoanService taiKhoanService;
    
    @GetMapping(value = "/")
    public String registerView(Model model) {
        model.addAttribute("register", new TaiKhoan()); 
        return "register";
    }
    
    @PostMapping(value = "/success")
    public String registerProcess(
        @ModelAttribute(name = "register") @Valid TaiKhoan taiKhoan, BindingResult result) {
        if (result.hasErrors()) 
            return "register"; 
        taiKhoanService.addTaiKhoan(taiKhoan); 
        
        return "redirect:/login";
    }
}
