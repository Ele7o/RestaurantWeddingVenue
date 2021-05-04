/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.NghiepVuService;
import com.nhahang.service.NhanVienService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author btson
 */
@Controller
@RequestMapping("/NghiepVu")
public class NghiepVuController {
    @Autowired
    private NghiepVuService nghiepVuService;
    
    @Autowired
    private NhanVienService nhanVienService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("nghiepvu",this.nghiepVuService.getNghiepVu());
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idNghiepVu",required = false)String idNghiepVu){
        if(idNghiepVu == null){
            model.addAttribute("nhanvien",this.nhanVienService.getNhanViens(""));
        }
        else{
            model.addAttribute("nhanvien",this.nghiepVuService.getNghiepVuById(Integer.parseInt(idNghiepVu)).getNhanViens());
        }
        return "nghiepvu";
    }
}
