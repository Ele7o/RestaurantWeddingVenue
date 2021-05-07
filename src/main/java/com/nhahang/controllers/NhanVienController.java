/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.NhanVien;

import com.nhahang.service.NghiepVuService;
import com.nhahang.service.NhanVienService;
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

@RequestMapping("/nhanvien")
public class NhanVienController {
    
    @Autowired
    private NhanVienService nhanVienService;
        
    @RequestMapping("/")
    public String addView(Model model, 
            @RequestParam(name="idNhanVien")String idNhanVien){
        int id = Integer.parseInt(idNhanVien);
        model.addAttribute("nhanvien", this.nhanVienService.getNhanVienById(id));

        return "nhanvien";
    }    
//    @RequestMapping("/")
//    public String addView(Model model,
//            @RequestParam(name="idNhanVien",
//                    required = false, 
//                    defaultValue = "0") int idNhanVien){
//        if(idNhanVien > 0){
//            model.addAttribute("nhanvien",this.nhanVienService.getNhanVienById(idNhanVien));
//        }
//        else{
//            model.addAttribute("nhanvien", new NhanVien());
//        }
//        return "nhanvien";
//    }
    
    @PostMapping("/add")
    public String addNhanVien(Model model,
            @ModelAttribute(value = "nhanvien") @Valid NhanVien nhanVien,
            BindingResult result){
        if(result.hasErrors()){
            return "nhanvien";
        }
        if(!this.nhanVienService.addOrUpdateNhanVien(nhanVien)){
            model.addAttribute("erroMsg","ERROR404");
            return "nhanvien";
        }
        return "redirect:/NghiepVu/";
    }
}