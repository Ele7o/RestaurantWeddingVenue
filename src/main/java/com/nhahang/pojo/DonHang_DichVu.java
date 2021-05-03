/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author X_X
 */
@Entity
@Table(name="donhang_dichvu")
public class DonHang_DichVu {
    @Column(name="id_dh_dv")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonHangDichVu;
    @Column(name="id_don_hang")
    private int idDonHang;
    @Column(name="id_dich_vu")
    private int idDichVu;
    @Column(name="id_so_luong")
    private int soLuong;
    @Column(name="tam_tinh")
    private double tamTinh;
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
     * @return the idDichVu
     */
    public int getIdDichVu() {
        return idDichVu;
    }

    /**
     * @param idDichVu the idDichVu to set
     */
    public void setIdDichVu(int idDichVu) {
        this.idDichVu = idDichVu;
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
     * @return the tamTinh
     */
    public double getTamTinh() {
        return tamTinh;
    }

    /**
     * @param tamTinh the tamTinh to set
     */
    public void setTamTinh(double tamTinh) {
        this.tamTinh = tamTinh;
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
