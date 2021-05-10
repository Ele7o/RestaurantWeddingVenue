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
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author X_X
 */
@Entity
@Table(name="tai_khoan")
public class TaiKhoan implements Serializable {
    private static long serialVersionUID=3L;
    private static String USER="ROLE_USER";
    private static String ADMIN="ROLE_ADMIN";
    @Column(name="id_tai_khoan")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTaiKhoan;
    @Column(name="mail")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", 
        message = "{user.email.error.invalidMsg}")
    private String mail;
    @Column(name="role")
    private String role;
    @Column(name="ten_tai_khoan")
    @Size(min = 1, max = 45, message = "{user.username.sizeMsg}")
    private String tenTaiKhoan;
    @Column(name="mat_khau")
    @NotNull(message = "{user.password.sizeMsg}")
    private String matKhau;
    @Column(name="ghi_chu")
    private String ghiChu;
    @Transient
    private String xacThucMatKhau;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the USER
     */
    public static String getUSER() {
        return USER;
    }

    /**
     * @param aUSER the USER to set
     */
    public static void setUSER(String aUSER) {
        USER = aUSER;
    }

    /**
     * @return the ADMIN
     */
    public static String getADMIN() {
        return ADMIN;
    }

    /**
     * @param aADMIN the ADMIN to set
     */
    public static void setADMIN(String aADMIN) {
        ADMIN = aADMIN;
    }

    /**
     * @return the idTaiKhoan
     */
    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    /**
     * @param idTaiKhoan the idTaiKhoan to set
     */
    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the tenTaiKhoan
     */
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    /**
     * @param tenTaiKhoan the tenTaiKhoan to set
     */
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    /**
     * @return the matKhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
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
     * @return the xacThucMatKhau
     */
    public String getXacThucMatKhau() {
        return xacThucMatKhau;
    }

    /**
     * @param xacThucMatKhau the xacThucMatKhau to set
     */
    public void setXacThucMatKhau(String xacThucMatKhau) {
        this.xacThucMatKhau = xacThucMatKhau;
    }
    
    
}
