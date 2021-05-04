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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author X_X
 */
@Entity
@Table(name = "nghiep_vu")
public class NghiepVu implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nghiep_vu")
    private int idNghiepVu;
    @Column(name = "ten_nghiep_vu")
    private String tenNghiepVu;
    @Column(name="ghi_chu")
    private String ghiChu;



    @OneToMany(mappedBy = "nghiepVus", fetch = FetchType.EAGER)
    private List<NhanVien> nhanViens;


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
     * @return the nhanViens
     */
    public List<NhanVien> getNhanViens() {
        return nhanViens;
    }

    /**
     * @param nhanViens the nhanViens to set
     */
    public void setNhanViens(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    /**
     * @return the nghiepVus
     */

//    public List<NghiepVu> getNghiepVu() {
//        return nghiepVu;
//    }
    
    
    
    

   
    
}
