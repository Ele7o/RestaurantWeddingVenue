/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.Sanh;
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
@RequestMapping("/Sanh")
public class SanhController {
    @Autowired
    private SanhService sanhService;
    
    @ModelAttribute
    public void addAttributes(Model model,HttpSession session){
        model.addAttribute("sanh",this.sanhService.getSanh());
    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam(name="idSanh",required = false)String idSanh){
        if(idSanh == null){
            model.addAttribute("sanh",this.sanhService.getSanh());
        }
        else{
            model.addAttribute("sanh",this.sanhService.getSanhById(Integer.parseInt(idSanh)));
        }
        return "sanh";
    }
    @RequestMapping("/suasanh")
    public String addView(Model model, @RequestParam(name="idSanh", required = false,defaultValue = "0")String idSanh){
        int id = Integer.parseInt(idSanh);
        if(id>0){
            model.addAttribute("sanh",this.sanhService.getSanhById(id));
        }
        else{
            model.addAttribute("sanh", new Sanh());
        }
        return "suasanh";
    }
    @PostMapping("/suasanh/add")
    public String addSanh(Model model, @ModelAttribute(value="sanh") @Valid Sanh sanh, BindingResult rs){
        if(rs.hasErrors()){
            return "suasanh";
        }
        if( !this.sanhService.addOrUpdateSanh(sanh)){
            model.addAttribute("error","ERROR404");
            return "suasanh";
        }
        return "redirect:/Sanh/";
    }
    
}
