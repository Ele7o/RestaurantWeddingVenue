/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.TaiKhoan;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author X_X
 */
public interface TaiKhoanService extends UserDetailsService{
    TaiKhoan getTaiKhoanByTenTaiKhoan(String tenTaiKhoan);
    boolean addTaiKhoan(TaiKhoan taiKhoan);
}
