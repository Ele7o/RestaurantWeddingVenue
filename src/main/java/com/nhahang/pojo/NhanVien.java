/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.pojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.persistence.Transient;

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
    @Transient
    private int idNghiepVuForm;
    
    @ManyToOne
    @JoinColumn(name ="id_nghiep_vu")
//    @JoinColumn(name ="id_nghiep_vu", referencedColumnName = "id_nghiep_vu")
    private NghiepVu nghiepVu;
    
    @OneToMany(mappedBy = "nhanVien2", fetch = FetchType.EAGER)
    private List<NhanVien_DonHang> nhanVien_donHang;
    

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
        return nghiepVu;
    }

    /**
     * @param nghiepVu the nghiepVu to set
     */
    public void setNghiepVu(NghiepVu nghiepVu) {
        this.nghiepVu = nghiepVu;
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

    public int getIdNghiepVuForm() {
        return idNghiepVuForm;
    }

    public void setIdNghiepVuForm(int idNghiepVuForm) {
        this.idNghiepVuForm = idNghiepVuForm;
    }

    /**
     * @return the nhanVien_donHang
     */
    public List<NhanVien_DonHang> getNhanVien_donHang() {
        return nhanVien_donHang;
    }

    /**
     * @param nhanVien_donHang the nhanVien_donHang to set
     */
    public void setNhanVien_donHang(List<NhanVien_DonHang> nhanVien_donHang) {
        this.nhanVien_donHang = nhanVien_donHang;
    }
    
    
    
    
}
