/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.NhanVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author btson
 */
@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    @RequestMapping("/")
    public String addView(Model model){
        model.addAttribute("nhanvien", new NhanVien());
        
        return "nhanvien";
    }
}
