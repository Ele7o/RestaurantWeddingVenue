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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author X_X
 */
@Controller
public class DangNhapController {
    @Autowired 
    private TaiKhoanService taiKhoanService;

    
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.setValidator(taiKhoanValidator);
//    } 
    
    @RequestMapping("/login/")
    public String login(Model model) {
        model.addAttribute("login", new TaiKhoan()); 
        return "login";
    }
    
    @GetMapping(value = "/register/")
    public String registerView(Model model) {
        model.addAttribute("regis", new TaiKhoan()); 
        return "register";
    }
    
    @PostMapping(value = "/register/")
    public String registerProcess(Model model,
        @ModelAttribute(name = "regis") @Valid TaiKhoan taiKhoan, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        if (!this.taiKhoanService.addTaiKhoan(taiKhoan)) {
            model.addAttribute("otherError", "Tao tác thêm tài khoản chưa thành công vui long thử lại");
            return "register";
        }
        return "redirect:/login/";
    }
    
    
}
