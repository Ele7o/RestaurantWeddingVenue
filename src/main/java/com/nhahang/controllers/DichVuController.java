/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.DichVuService;
import com.nhahang.pojo.DichVu;
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
@RequestMapping("/DichVu")
public class DichVuController {
    @Autowired
    private DichVuService dichVuService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("dichvu",this.dichVuService.getDichVus());
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idDichVu",required = false)String idDichVu){
        if(idDichVu == null){
            model.addAttribute("dichvu",this.dichVuService.getDichVus());
        }
        else{
            model.addAttribute("dichvu",this.dichVuService.getDichVuById2(idDichVu));
        }
        return "dichvu";
    }
    @RequestMapping("/tenDv")
    public String index2(Model model,@RequestParam(name="tenDv",required = true)String tenDv){
        if(tenDv==null){
            return "redirect:/DichVu/";
        }
        else{
            model.addAttribute("dichvu",this.dichVuService.getDichVuByName(tenDv));
        }
        return "dichvu";
    }
   
}
