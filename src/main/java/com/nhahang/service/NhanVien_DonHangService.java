/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.NhanVien_DonHang;
import java.util.List;

/**
 *
 * @author btson
 */

public interface NhanVien_DonHangService {
    List<NhanVien_DonHang> getNhanVien_DonHangs(String kw);
    List<NhanVien_DonHang> getNhanVien_DonHangs();
    NhanVien_DonHang getNhanVien_DonHangById(int idNhanVienDonHang);
    boolean addOrUpdateNv_Dh(NhanVien_DonHang nhanVien_donHang);
    boolean deleteNhanVienDonHang(int idNhanVienDonHang);
}
