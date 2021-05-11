/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.DichVu;
import com.nhahang.service.DichVuService;
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
@RequestMapping("/DichVuView")
public class DichVuViewController {
    @Autowired
    private DichVuService dichVuService;
    
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idDichVu", required = false ,defaultValue = "0")String idDichVu){
        int id = Integer.parseInt(idDichVu);
        if(id>0){
            model.addAttribute("dichvu2",this.dichVuService.getDichVuById(id));
        }
        else{
            model.addAttribute("dichvu2", new DichVu());
        }
        return "dichvuview";
    }

    @PostMapping("/add")
    public String addDichVu(Model model, @ModelAttribute(value="dichvu2")@Valid DichVu dichVu, BindingResult rs){
        if(rs.hasErrors()){
            return "dichvu";
        }
        if(!this.dichVuService.addOrUpdateDichVu(dichVu)){
            model.addAttribute("errorMsg","ERROR404");
            return "dichvu";
        }
        return "redirect:/DichVu/";
        
    }
}
