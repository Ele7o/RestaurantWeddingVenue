/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.pojo.NghiepVu;
import com.nhahang.service.NghiepVuService;
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
@RequestMapping("/NghiepVuListView")
public class NghiepVuListViewController {
    
    @Autowired
    private NghiepVuService nghiepVuService;
    
    @RequestMapping("/")
    public String addView(Model model, @RequestParam(name="idNghiepVu",required = false, defaultValue = "0")String idNghiepVu){
      int id = Integer.parseInt(idNghiepVu);
      if(id>0){
          model.addAttribute("nghiepvu2",this.nghiepVuService.getNghiepVuById(id));
      }
      else{
          model.addAttribute("nghiepvu2",new NghiepVu());
      }
        return "nghiepvulistview";
    }
    @PostMapping("/add")
    public String addNghiepVu(Model model, @ModelAttribute(value="khachhang2") @Valid NghiepVu nghiepVu, BindingResult rs){
        if(rs.hasErrors()){
            return "nghiepvulistview";
        }
        if(!this.nghiepVuService.addOrUpdateNghiepVu(nghiepVu)){
            model.addAttribute("errorMsg","ERROR404");
            return "nghiepvulistview";
        }
        return "redirect:/NghiepVuList/";
    }
}
