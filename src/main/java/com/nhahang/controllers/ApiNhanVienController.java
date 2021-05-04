/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author btson
 */
@RestController
@RequestMapping("/api")
public class ApiNhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    
    @DeleteMapping("/nhanvien/{idNhanVien}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNhanVien(@PathVariable(name="idNhanVien")int idNhanVien){
        this.nhanVienService.deleteNhanVien(idNhanVien);
    }
}
