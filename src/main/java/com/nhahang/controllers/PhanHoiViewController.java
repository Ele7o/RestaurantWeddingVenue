/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.PhanHoi;
import com.nhahang.service.PhanHoiService;
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
@RequestMapping("/PhanHoiView")
public class PhanHoiViewController {
    @Autowired
    private PhanHoiService phanHoiService;
    
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idPhanHoi", required = false, defaultValue = "0")String idPhanHoi){
        int id = Integer.parseInt(idPhanHoi);
        if(id>0){
            model.addAttribute("phanhoi2", this.phanHoiService.getPhanHoiById(id));
        }
        else{
            model.addAttribute("phanhoi2", new PhanHoi());
        }
        return "phanhoiview";
    }
    
    @PostMapping("/add")
    public String addPhanHoi(Model model, @ModelAttribute(value="phanhoi2")@Valid PhanHoi phanHoi, BindingResult rs){
        if(rs.hasErrors()){
            return "phanhoiview";
        }
        if(!this.phanHoiService.addOrUpdatePhanHoi(phanHoi)){
            model.addAttribute("erroMsg","ERROR404");
            return "phanhoiview";
        }
        return "redirect:/PhanHoi/";
    }   
    
}
