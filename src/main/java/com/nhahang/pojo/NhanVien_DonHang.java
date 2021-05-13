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
import javax.persistence.Transient;

/**
 *
 * @author X_X
 */
@Entity
@Table(name="nvien_dhang")
public class NhanVien_DonHang implements Serializable {
    @Column(name="id_nvien_dhang")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNhanVienDonHang;
    
    @ManyToOne
    @JoinColumn(name="id_nhanvien")
    private NhanVien nhanVien2;
    @Transient
    private int idNhanVienForm2;
    
    @ManyToOne
    @JoinColumn(name="id_donhang")
    private DonHang donHang3;
    @Transient
    private int idDonHangForm2;
    
    @Column(name="ghi_chu")
    private String ghiChu;

    /**
     * @return the idNhanVienDonHang
     */
    public int getIdNhanVienDonHang() {
        return idNhanVienDonHang;
    }

    /**
     * @param idNhanVienDonHang the idNhanVienDonHang to set
     */
    public void setIdNhanVienDonHang(int idNhanVienDonHang) {
        this.idNhanVienDonHang = idNhanVienDonHang;
    }

    /**
     * @return the nhanVien2
     */
    public NhanVien getNhanVien2() {
        return nhanVien2;
    }

    /**
     * @param nhanVien2 the nhanVien2 to set
     */
    public void setNhanVien2(NhanVien nhanVien2) {
        this.nhanVien2 = nhanVien2;
    }

    /**
     * @return the idNhanVienForm2
     */
    public int getIdNhanVienForm2() {
        return idNhanVienForm2;
    }

    /**
     * @param idNhanVienForm2 the idNhanVienForm2 to set
     */
    public void setIdNhanVienForm2(int idNhanVienForm2) {
        this.idNhanVienForm2 = idNhanVienForm2;
    }

    /**
     * @return the donHang3
     */
    public DonHang getDonHang3() {
        return donHang3;
    }

    /**
     * @param donHang3 the donHang3 to set
     */
    public void setDonHang3(DonHang donHang3) {
        this.donHang3 = donHang3;
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
