/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.NhanVien_DonHang;
import com.nhahang.service.NhanVien_DonHangService;
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
@ControllerAdvice
@RequestMapping("/nvdhview")
public class NVien_DHangViewController {
    
    @Autowired
    private NhanVien_DonHangService nhanVien_donHangService;
    
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idNhanVienDonHang",required = false, defaultValue = "0")String idNhanVienDonHang){
        int id = Integer.parseInt(idNhanVienDonHang);
        if(id>0){
            model.addAttribute("nvdh2",this.nhanVien_donHangService.getNhanVien_DonHangById(id));
        }else{
            model.addAttribute("nvdh2", new NhanVien_DonHang());
        }
        return "nvdhview";
    }
    @PostMapping("/add")
    public String addNVDonHang(Model model, @ModelAttribute(value="nvdh2") @Valid NhanVien_DonHang nhanVien_donHang, BindingResult rs){
        if(rs.hasErrors()){
            return "nvdhview";
        }
        if(!this.nhanVien_donHangService.addOrUpdateNv_Dh(nhanVien_donHang)){
            model.addAttribute("errorMsg","ERROR404");
            return "nvdhview";
        }
        return "redirect:/nvdh";
    }
}
