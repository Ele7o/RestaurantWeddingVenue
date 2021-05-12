/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.pojo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;

/**
 *
 * @author X_X
 */
@Entity
@Table(name="khach_hang")
public class KhachHang {
    @Column(name = "id_khach_hang")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idKhachHang;
    @Column(name="so_dt")
    private int soDT;
    @Column(name="ten_khach_hang")
    private String tenKhachHang;
    @Column(name="ghi_chu")
    private String ghiChu;
    
    @OneToMany(mappedBy = "khachHang",fetch = FetchType.EAGER)
    private List<DonHang> donHang;

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
     * @return the soDT
     */
    public int getSoDT() {
        return soDT;
    }

    /**
     * @param soDT the soDT to set
     */
    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    /**
     * @return the tenKhachHang
     */
    public String getTenKhachHang() {
        return tenKhachHang;
    }

    /**
     * @param tenKhachHang the tenKhachHang to set
     */
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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
     * @return the donHang
     */
    public List<DonHang> getDonHang() {
        return donHang;
    }

    /**
     * @param donHang the donHang to set
     */
    public void setDonHang(List<DonHang> donHang) {
        this.donHang = donHang;
    }
    
    
}
