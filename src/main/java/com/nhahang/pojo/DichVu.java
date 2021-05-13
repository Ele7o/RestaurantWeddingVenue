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

/**
 *
 * @author X_X
 */
@Entity
@Table (name ="dich_vu")
public class DichVu {
    @Column(name="id_dich_vu")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDichVu;
    @Column(name = "ten_dich_vu")
    private String tenDichVu;
    @Column (name = "gia")
    private double gia;
    @Column (name ="ghi_chu")
    private String ghiChu;
    
    @OneToMany(mappedBy = "dichVu2", fetch = FetchType.EAGER)
    private List<DonHang_DichVu> donHang_dichVu;

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
     * @return the tenDichVu
     */
    public String getTenDichVu() {
        return tenDichVu;
    }

    /**
     * @param tenDichVu the tenDichVu to set
     */
    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
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
     * @return the donHang_dichVu
     */
    public List<DonHang_DichVu> getDonHang_dichVu() {
        return donHang_dichVu;
    }

    /**
     * @param donHang_dichVu the donHang_dichVu to set
     */
    public void setDonHang_dichVu(List<DonHang_DichVu> donHang_dichVu) {
        this.donHang_dichVu = donHang_dichVu;
    }
    
    
}
