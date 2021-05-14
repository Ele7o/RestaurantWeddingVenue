/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.DonHang;
import com.nhahang.service.DonHangService;
import com.nhahang.service.KhachHangService;
import com.nhahang.service.SanhService;
import javax.servlet.http.HttpSession;
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
 * @author X_X
 */
@Controller
@ControllerAdvice
@RequestMapping("/DonHang")
public class DonHangController {
    @Autowired
    private DonHangService donHangService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private SanhService sanhService;
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("donhang",this.donHangService.getDonHangs());
        model.addAttribute("khachhang3",this.khachHangService.getKhachHang());
        model.addAttribute("sanh3",this.sanhService.getSanh());
        
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idDonHang",required = false)String idDonHang){
        if(idDonHang == null){
            model.addAttribute("donhang",this.donHangService.getDonHangs());
        }
        else{
            model.addAttribute("donhang",this.donHangService.getDonHangs(idDonHang));
        }
        return "donhang";
    }
    
    @RequestMapping("/sanh/")
    public String index2(Model model, @RequestParam(name="idSanh",required = true)String idSanh){

        
            model.addAttribute("donhang",this.sanhService.getSanhById(Integer.parseInt(idSanh)).getDonHang());
        
             return "donhang";
    }
    //Repeat
    @RequestMapping("/kh/")
    public String index3(Model model, @RequestParam(name="idKhachHang",required = true)String idKhachHang){
            model.addAttribute("donhang",this.khachHangService.getKhachHangById(Integer.parseInt(idKhachHang)).getDonHang());
            return "donhang";
    }
    
}
