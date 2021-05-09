/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.DichVu;
import com.nhahang.service.DichVuService;
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
            model.addAttribute("dichvu",this.dichVuService.getDichVuById(Integer.parseInt(idDichVu)));
        }
        return "dichvu";
    }
    @RequestMapping("/suadichvu")
    public String addView(Model model, @RequestParam(name="idDichVu", required = false,defaultValue = "0")String idDichVu){
        int id = Integer.parseInt(idDichVu);
        if(id>0){
            model.addAttribute("dichvu",this.dichVuService.getDichVuById(id));
        }
        else{
            model.addAttribute("dichvu", new DichVu());
        }
        return "suadichvu";
    }
}
