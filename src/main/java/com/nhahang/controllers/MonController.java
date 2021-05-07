/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.MonService;
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
@RequestMapping("/Mon")
public class MonController {
    @Autowired
    private MonService monService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("mon",this.monService.getMon());
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idMon",required = false)String idMon){
        if(idMon == null){
            model.addAttribute("mon",this.monService.getMon());
        }
        else{
            model.addAttribute("mon",this.monService.getMonById(Integer.parseInt(idMon)));
        }
        return "mon";
    }
}
