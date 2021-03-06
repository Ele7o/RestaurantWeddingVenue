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
@RequestMapping("/NghiepVu")
public class NghiepVuController {
    @Autowired
    private NghiepVuService nghiepVuService;
    
    @Autowired
    private NhanVienService nhanVienService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("nghiepvu",this.nghiepVuService.getNghiepVu());
        model.addAttribute("nhanvien",this.nhanVienService.getNhanViens());
        
    }
    @RequestMapping("/info")
    public String addViewInfo(Model model,
                                @RequestParam(name="idNhanVien",required = false)String idNhanVien) {
        int id= Integer.parseInt(idNhanVien);
        if(id != 0){
            model.addAttribute("nhanvien",this.nhanVienService.getNhanVienById(id));
        }
        return "ttnhanvien";
    } 
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idNghiepVu",required = false)String idNghiepVu){
        if(idNghiepVu == null){
            model.addAttribute("nhanvien",this.nhanVienService.getNhanViens(""));
        }
        else{
            model.addAttribute("nhanvien",this.nghiepVuService.getNghiepVuById(Integer.parseInt(idNghiepVu)).getNhanVien());
        }
        return "nghiepvu";
    }
    @RequestMapping("/idNv/")
    public String index2(Model model, @RequestParam(name="idNv",required = true)String idNhanVien){
        
        model.addAttribute("nhanvien",this.nhanVienService.getNhanVienById2(idNhanVien));
        return "nghiepvu";
    }
    @RequestMapping("/tenNV")
    public String index3(Model model, @RequestParam(name="tenNV",required = true)String tenNhanVien){
        model.addAttribute("nhanvien",this.nhanVienService.getNhanViens(tenNhanVien));
        return "nghiepvu";
    }
}
