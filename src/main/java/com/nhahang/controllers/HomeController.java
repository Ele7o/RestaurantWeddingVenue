
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.nhahang.controllers;

import com.nhahang.pojo.NghiepVu;
import com.nhahang.service.NghiepVuService;
import com.nhahang.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author X_X
 */
@Controller
@ControllerAdvice
public class HomeController {
      
   @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private NghiepVuService nghiepVuService;
  
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idNghiepVu",required = false) String idNghiepVu){
        if(idNghiepVu == null){
            model.addAttribute("nhanviens",this.nhanVienService.getNhanViens(""));
        }
        else
        {
            model.addAttribute("nhanviens",this.nghiepVuService.getNghiepVuById(Integer.parseInt(idNghiepVu)).getNhanViens());
        }
        
        return "index";
    }
}
