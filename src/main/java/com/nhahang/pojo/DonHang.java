/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author X_X
 */
@Entity
@Table(name="don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_don_hang")
    private int idDonHang;
    @Column(name = "id_khach_hang")
    @JoinColumn(name ="id_khach_hang")
    private int idKhachHang;
    @Column(name = "id_sanh")
    @JoinColumn(name = "id_sanh")
    private int idSanh;
    @Column(name = "ngay_to_chuc")
    private Date ngayToChuc;
    @Column(name = "ghi_chu")
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
     * @return the idKhachHang
     */
    public int getIdKhachHang() {
        return idKhachHang;
    }

    /**
     * @param idKhachHang the idKhachHang to set
     */
    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

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
     * @return the ngayToChuc
     */
    public Date getNgayToChuc() {
        return ngayToChuc;
    }

    /**
     * @param ngayToChuc the ngayToChuc to set
     */
    public void setNgayToChuc(Date ngayToChuc) {
        this.ngayToChuc = ngayToChuc;
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
