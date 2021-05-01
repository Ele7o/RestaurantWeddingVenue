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
@Table(name = "nghiep_vu")
public class NghiepVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nghiep_vu")
    private int idNghiepVu;
    @Column(name = "ten_nghiep_vu")
    private String tenNghiepVu;
    @Column(name="ghi_chu")
    private String ghiChu;
//    @OneToMany(mappedBy = "nghiep_vu", fetch = FetchType.EAGER)
//    private List<NghiepVu> nghiepVu;

    /**
     * @return the idNghiepVu
     */
    public int getIdNghiepVu() {
        return idNghiepVu;
    }

    /**
     * @param idNghiepVu the idNghiepVu to set
     */
    public void setIdNghiepVu(int idNghiepVu) {
        this.idNghiepVu = idNghiepVu;
    }

    /**
     * @return the tenNghiepVu
     */
    public String getTenNghiepVu() {
        return tenNghiepVu;
    }

    /**
     * @param tenNghiepVu the tenNghiepVu to set
     */
    public void setTenNghiepVu(String tenNghiepVu) {
        this.tenNghiepVu = tenNghiepVu;
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
     * @return the nghiepVu
     */
//    public List<NghiepVu> getNghiepVu() {
//        return nghiepVu;
//    }

    /**
     * @param nghiepVu the nghiepVu to set
     */
//    public void setNghiepVu(List<NghiepVu> nghiepVu) {
//        this.nghiepVu = nghiepVu;
//    }
//    
    
   
    
}
