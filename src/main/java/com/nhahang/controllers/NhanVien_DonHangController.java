/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.DonHangService;
import com.nhahang.service.NhanVienService;
import com.nhahang.service.NhanVien_DonHangService;
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
@RequestMapping("/nvdh")
public class NhanVien_DonHangController {
    
    @Autowired
    private NhanVien_DonHangService nhanVien_donHangService;
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private DonHangService donHangService;
    
    @ModelAttribute
    public void addAttribute(Model model, HttpSession session){
        model.addAttribute("nvdh",this.nhanVien_donHangService.getNhanVien_DonHangs());
        model.addAttribute("nhanvien2",this.nhanVienService.getNhanViens());
        model.addAttribute("donhang2",this.donHangService.getDonHangs());
    }
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idNv_Dh",required = false)String idNv_Dh){
        if(idNv_Dh == null){
            model.addAttribute("nvdh",this.nhanVien_donHangService.getNhanVien_DonHangs());
        }
        else{
            model.addAttribute("nvdh",this.donHangService.getDonHangById(Integer.parseInt(idNv_Dh)).getNhanVien_DonHang());
        }
        return "nhanvien_donhang";
    }
    
}
