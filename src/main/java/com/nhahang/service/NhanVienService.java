/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.NhanVien;
import java.util.List;
/**
 *
 * @author X_X
 */
public interface NhanVienService {
    List<NhanVien> getNhanViens();
    List<NhanVien> getNhanViens(String kw);
    boolean deleteNhanVien(int idNhanVien);
    boolean addOrUpdateNhanVien(NhanVien nhanvien);
    NhanVien getNhanVienById(int idNhanVien);
    NhanVien getNhanVienByName (String tenNhanVien);
}
