/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.TaiKhoan;
import com.nhahang.service.TaiKhoanService;
import com.nhahang.validator.WebAppValidator;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author X_X
 */
@Controller
public class DangNhapController {
    @Autowired 
    private TaiKhoanService taiKhoanService;
    @Autowired 
    private WebAppValidator taiKhoanValidator;
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(taiKhoanValidator);
    } 
    
    @GetMapping(value = "/register")
    public String registerView(Model model) {
        model.addAttribute("taiKhoan", new TaiKhoan()); 
        return "register";
    }
    
    @PostMapping(value = "/register")
    public String registerProcess(
    @ModelAttribute(name = "user") @Valid TaiKhoan taiKhoan, 
    BindingResult result) {
        if (result.hasErrors()) 
            return "register"; 
        taiKhoanService.addTaiKhoan(taiKhoan);
        return "redirect:/login";
        }
}
