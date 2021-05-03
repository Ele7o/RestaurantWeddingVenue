/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.NhanVien;
import com.nhahang.service.NghiepVuService;
import com.nhahang.service.NhanVienService;
import java.math.BigDecimal;
import javax.servlet.http.HttpSession;
import org.hibernate.mapping.Map;
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
@RequestMapping("/nhanvien")
public class NhanVienController {
    
    
    @Autowired
    private NhanVienService nhanVienService;
  
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idNghiepVu",required = false) String idNghiepVu){
        if(idNghiepVu == null){
            model.addAttribute("nhanviens",this.nhanVienService.getNhanViens(""));
        }
        
        return "nhanvien";
    }
}
