/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author X_X
 */
//@Entity
//@Table(name="thanh_tien")
public class ThanhTien {
    @Column(name="id_don_hang")
    private int idDonHang;
    @Column(name="id_mon")
    private int idMon;
    @Column(name="so_luong")
    private int soLuong;
    @Column(name="ghi_chu")
    private String ghiChu;

    /**
     * @return the idDonHang
     */
    public int getIdDonHang() {
        return idDonHang;
    }

    /**
     * @param idDonHang the idDonHang to set
     */
    public void setIdDonHang(int idDonHang) {
        this.idDonHang = idDonHang;
    }

    /**
     * @return the idMon
     */
    public int getIdMon() {
        return idMon;
    }

    /**
     * @param idMon the idMon to set
     */
    public void setIdMon(int idMon) {
        this.idMon = idMon;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * @return the ghiChu
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * @param ghiChu the ghiChu to set
     */
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
