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
@Table(name="mon")
public class Mon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mon")
    private int idMon;
    @Column(name = "ten_mon")
    private String tenMon;
    @Column(name = "gia")
    private double gia;
    @Column(name = "ghi_chu")
    private String ghiChu;

    /**
     * @return the idMon
     */
    public int getIdMon() {
        return idMon;
    }

    /**
     * @param idMon the idMon to set
     */
    public void setIdMon(int idMon) {
        this.idMon = idMon;
    }

    /**
     * @return the tenMon
     */
    public String getTenMon() {
        return tenMon;
    }

    /**
     * @param tenMon the tenMon to set
     */
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
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
    
    
}
