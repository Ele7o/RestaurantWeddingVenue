/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.NghiepVu;
import com.nhahang.service.NghiepVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author X_X
 */
@Controller

public class HomeController {
       @Autowired
       private NghiepVuService nghiepVuService;
       
       @RequestMapping("/")
       public String index(Model model){
           model.addAttribute("message","Nhà hàng tiệc cưới");
           model.addAttribute("NghiepVu",this.nghiepVuService.getNghiepVu());
           
           return "index";
       }
}
