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
@Table(name="sanh")
public class Sanh {
    @Column(name="id_sanh")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSanh;
    @Column(name="suc_chua")
    private int sucChua;
    @Column(name="gia")
    private double gia;
    @Column(name="tinh_trang")
    private String tinhTrang;
    @Column(name="ghi_chu")
    private String ghiChu;

    /**
     * @return the idSanh
     */
    public int getIdSanh() {
        return idSanh;
    }

    /**
     * @param idSanh the idSanh to set
     */
    public void setIdSanh(int idSanh) {
        this.idSanh = idSanh;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }

    /**
     * @return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
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
