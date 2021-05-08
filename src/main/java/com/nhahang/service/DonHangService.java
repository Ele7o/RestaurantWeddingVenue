/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.DonHang;
import java.util.List;

/**
 *
 * @author btson
 */
public interface DonHangService {
    List<DonHang> getDonHangs();
    DonHang getDonHangById(int idDonHang);
    boolean addOrUpdateDonHang(DonHang donHang);
}
