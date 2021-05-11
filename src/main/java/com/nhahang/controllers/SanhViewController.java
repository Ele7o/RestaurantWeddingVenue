/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.Sanh;
import com.nhahang.service.SanhService;
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
@RequestMapping("/SanhView")
public class SanhViewController {
    @Autowired
    private SanhService sanhService;
    
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idSanh",required = false, defaultValue = "0")String idSanh){
        int id = Integer.parseInt(idSanh);
        if(id>0){
            model.addAttribute("sanh2", this.sanhService.getSanhById(id));
        }
        else{
            model.addAttribute("sanh2", new Sanh());
        }
        return "SanhView";
    }
    @PostMapping("/add")
    public String addSanh(Model model, 
            @ModelAttribute(value="sanh2")@Valid Sanh sanh, 
            BindingResult rs){
        if(rs.hasErrors()){
            return "SanhView";
        }
        if(!this.sanhService.addOrUpdateSanh(sanh)){
            model.addAttribute("errorMsg","ERRO404");
            return("SanhView");
        }
        return "redirect:/Sanh/";
    }
}
