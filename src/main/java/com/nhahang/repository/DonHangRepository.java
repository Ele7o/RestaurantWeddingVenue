/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository;

import com.nhahang.pojo.DonHang;
import java.util.List;

/**
 *
 * @author btson
 */
public interface DonHangRepository {
    List<DonHang> getDonHangs();
    DonHang getDonHangById(int idDonHang);
}