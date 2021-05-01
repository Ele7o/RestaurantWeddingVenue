///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.nhahang.controllers;
//
//import com.nhahang.pojo.NghiepVu;
//import com.nhahang.service.NghiepVuService;
//import com.nhahang.service.NhanVienService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// *
// * @author X_X
// */
//@Controller
//
//public class HomeController {
//       @Autowired
//       private NghiepVuService nghiepVuService;
//       @Autowired
//       private NhanVienService nhanVienService;
//       @ModelAttribute
//       public void addAttributes(Model model){
//           model.addAttribute("NghiepVu",this.nghiepVuService.getNghiepVu());
//       }
////       @RequestMapping("/")
////    public String index(Model model, @RequestParam(name = "idNghiepVu", required = false) String idNghiepVu) {
////        
////        if (idNghiepVu == null)
////            model.addAttribute("products", this.nhanVienService.getNhanVien(""));
////        else
////            model.addAttribute("products", this.nghiepVuService.getNghiepVuById(Integer.parseInt(idNghiepVu)).getNghiepVu());
////        
////        return "index";
////    }
//       @RequestMapping("/")
//       public String index(Model model){
//          
//            
//            return "index";
//       }
//}
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
@ControllerAdvice

public class HomeController {
//    public String index(m)
       @Autowired
       private NghiepVuService nghiepVuService;
       
       @RequestMapping("/")
       public String index(Model model){
           model.addAttribute("message","Nhà hàng tiệc cưới");
           model.addAttribute("NghiepVu",this.nghiepVuService.getNghiepVu());
           
           return "index";
       }
}