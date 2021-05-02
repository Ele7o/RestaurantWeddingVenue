/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.KhachHang;
import java.util.List;

/**
 *
 * @author X_X
 */
public interface KhachHangService {
    List<KhachHang> getKhachHang();
    KhachHang getKhachHangById(int idKhachHang);
}
