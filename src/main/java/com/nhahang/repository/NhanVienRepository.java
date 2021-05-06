/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository;

import com.nhahang.pojo.NhanVien;
import java.util.List;

/**
 *
 * @author X_X
 */
public interface NhanVienRepository {
    List<NhanVien> getNhanViens(String kw);
    boolean deleteNhanVien(int idNhanVien);
    boolean addOrUpdateNhanVien(NhanVien nhanVien);
    NhanVien getNhanVienById(int idNhanVien);
    
}
