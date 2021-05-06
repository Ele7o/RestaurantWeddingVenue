/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.PhanHoiService;
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
@RequestMapping("/PhanHoi")
public class PhanHoiController {
    @Autowired
    private PhanHoiService phanHoiService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("phanhoi",this.phanHoiService.getPhanHoi());
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idPhanHoi",required = false)String idPhanHoi){
        if(idPhanHoi == null){
            model.addAttribute("phanhoi",this.phanHoiService.getPhanHoi());
        }
        else{
            model.addAttribute("phanhoi",this.phanHoiService.getPhanHoiById(Integer.parseInt(idPhanHoi)));
        }
        return "phanhoi";
    }
}
