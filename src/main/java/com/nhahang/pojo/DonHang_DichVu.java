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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

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
    
    
    @ManyToOne
    @JoinColumn(name="id_don_hang")
    private DonHang donHang2;
    @Transient
    private int idDonHangForm2;
    
    @ManyToOne
    @JoinColumn(name="id_dich_vu")
    private DichVu dichVu2;
    @Transient
    private int idDichVuForm2;
    
    @Column(name="so_luong")
    private int soLuong;
    @Column(name="tam_tinh")
    private double tamTinh;
    @Column(name="ghi_chu")
    private String ghiChu;

    /**
     * @return the idDonHang
     */
    

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

    /**
     * @return the idDonHangDichVu
     */
    public int getIdDonHangDichVu() {
        return idDonHangDichVu;
    }

    /**
     * @param idDonHangDichVu the idDonHangDichVu to set
     */
    public void setIdDonHangDichVu(int idDonHangDichVu) {
        this.idDonHangDichVu = idDonHangDichVu;
    }

    /**
     * @return the donHang
     */
    public DonHang getDonHang2() {
        return donHang2;
    }

    /**
     * @param donHang the donHang to set
     */
    public void setDonHang2(DonHang donHang) {
        this.donHang2 = donHang;
    }

    /**
     * @return the idDonHangForm
     */
    

    /**
     * @return the dichVu
     */
    

    /**
     * @return the idDichVuForm
     */
  

    /**
     * @return the dichVu2
     */
    public DichVu getDichVu2() {
        return dichVu2;
    }

    /**
     * @param dichVu2 the dichVu2 to set
     */
    public void setDichVu2(DichVu dichVu2) {
        this.dichVu2 = dichVu2;
    }

    /**
     * @return the idDonHangForm2
     */
    public int getIdDonHangForm2() {
        return idDonHangForm2;
    }

    /**
     * @param idDonHangForm2 the idDonHangForm2 to set
     */
    public void setIdDonHangForm2(int idDonHangForm2) {
        this.idDonHangForm2 = idDonHangForm2;
    }

    /**
     * @return the idDichVuForm2
     */
    public int getIdDichVuForm2() {
        return idDichVuForm2;
    }

    /**
     * @param idDichVuForm2 the idDichVuForm2 to set
     */
    public void setIdDichVuForm2(int idDichVuForm2) {
        this.idDichVuForm2 = idDichVuForm2;
    }
    
    
}
