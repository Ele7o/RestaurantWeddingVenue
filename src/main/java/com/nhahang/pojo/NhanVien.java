/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

/**
 *
 * @author X_X
 */
@Entity
@Table(name="nhan_vien")
public class NhanVien implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nhan_vien")
    private int idNhanVien;
    @Column(name = "ten_nhan_vien")
    private String tenNhanVien;

//    @ManyToOne
//    @JoinColumn(name ="id_nghiep_vu")
//    private int idNghiepVu;

    @ManyToOne
    @JoinColumn(name ="id_nghiep_vu", referencedColumnName = "id_nghiep_vu")
    private NghiepVu nghiepVus;

    @Column(name = "ghi_chu")
    private String ghiChu;

    /**
     * @return the idNhanVien
     */
    public int getIdNhanVien() {
        return idNhanVien;
    }

    /**
     * @param idNhanVien the idNhanVien to set
     */
    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    /**
     * @return the tenNhanVien
     */
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    /**
     * @param tenNhanVien the tenNhanVien to set
     */
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    /**
     * @return the nghiepVu
     */
    public NghiepVu getNghiepVu() {
        return nghiepVus;
    }

    /**
     * @param nghiepVu the nghiepVu to set
     */
    public void setNghiepVu(NghiepVu nghiepVu) {
        this.nghiepVus = nghiepVu;
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
