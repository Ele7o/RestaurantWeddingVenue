/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.DonHang_DichVu;
import java.util.List;

/**
 *
 * @author btson
 */
public interface DonHang_DichVuService {
    List<DonHang_DichVu> getDonHang_DichVus(String kw);
    List<DonHang_DichVu> getDonHang_DichVus();
    DonHang_DichVu getDonHang_DichVu(int idDh_Dv);
    boolean addOrUpdateDh_Dv(DonHang_DichVu donHang_dichVu);
    boolean deleteDonHangDichVu(int idDonHangDichVu);
}
