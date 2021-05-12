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

/**
 *
 * @author X_X
 */
@Entity
@Table(name="phan_hoi")
public class PhanHoi {
    @Column(name = "id_phan_hoi")
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPhanHoi;
    
//    @ManyToOne
//    @JoinColumn(name = "id_don_hang")
//    private DonHang donHang;
    @Column(name="id_don_hang")
    private int idDonHang;
    @Column (name = "loai_phan_hoi")
    private String loaiPhanHoi;
    @Column(name="noi_dung")
    private String noiDung;
    @Column(name="ghi_chu")
    private String ghiChu;

    /**
     * @return the idPhanHoi
     */
    public int getIdPhanHoi() {
        return idPhanHoi;
    }

    /**
     * @param idPhanHoi the idPhanHoi to set
     */
    public void setIdPhanHoi(int idPhanHoi) {
        this.idPhanHoi = idPhanHoi;
    }

    /**
     * @return the idDonHang
     */
   

    /**
     * @return the loaiPhanHoi
     */
    public String getLoaiPhanHoi() {
        return loaiPhanHoi;
    }

    /**
     * @param loaiPhanHoi the loaiPhanHoi to set
     */
    public void setLoaiPhanHoi(String loaiPhanHoi) {
        this.loaiPhanHoi = loaiPhanHoi;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
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
    
    
}
