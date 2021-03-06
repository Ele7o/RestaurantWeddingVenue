/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author X_X
 */
@Entity
@Table(name="don_hang")
public class DonHang implements Serializable{
    @Column(name="id_don_hang")
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idDonHang;
    
    @ManyToOne  
    @JoinColumn(name="id_khach_hang")
    private KhachHang khachHang;
    @Transient
    private int idKhachHangForm;
    
    @ManyToOne
    @JoinColumn(name="id_sanh")
    private Sanh sanh;
    @Transient
    private int idSanhForm;
    
    @Column(name="ngay_to_chuc")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayToChuc;
    @Column(name="ghi_chu")
    private String ghiChu;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "donHang")
    private List<PhanHoi> phanHoi;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "donHang2")
    private List<DonHang_DichVu> donHang_dichVu;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "donHang3")
    private List<NhanVien_DonHang> nhanVien_DonHang;
  
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

    /**
     * @return the phanHoi
     */
   

    /**
     * @return the khachHang
     */
    public KhachHang getKhachHang() {
        return khachHang;
    }

    /**
     * @param khachHang the khachHang to set
     */
    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    /**
     * @return the idKhachHangForm
     */
    public int getIdKhachHangForm() {
        return idKhachHangForm;
    }

    /**
     * @param idKhachHangForm the idKhachHangForm to set
     */
    public void setIdKhachHangForm(int idKhachHangForm) {
        this.idKhachHangForm = idKhachHangForm;
    }

    /**
     * @return the sanh
     */
    public Sanh getSanh() {
        return sanh;
    }

    /**
     * @param sanh the sanh to set
     */
    public void setSanh(Sanh sanh) {
        this.sanh = sanh;
    }

    /**
     * @return the idSanhForm
     */
    public int getIdSanhForm() {
        return idSanhForm;
    }

    /**
     * @param idSanhForm the idSanhForm to set
     */
    public void setIdSanhForm(int idSanhForm) {
        this.idSanhForm = idSanhForm;
    }

    /**
     * @return the phanHoi
     */
    public List<PhanHoi> getPhanHoi() {
        return phanHoi;
    }

    /**
     * @param phanHoi the phanHoi to set
     */
    public void setPhanHoi(List<PhanHoi> phanHoi) {
        this.phanHoi = phanHoi;
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

    /**
     * @return the nhanVien_DonHang
     */
    public List<NhanVien_DonHang> getNhanVien_DonHang() {
        return nhanVien_DonHang;
    }

    /**
     * @param nhanVien_DonHang the nhanVien_DonHang to set
     */
    public void setNhanVien_DonHang(List<NhanVien_DonHang> nhanVien_DonHang) {
        this.nhanVien_DonHang = nhanVien_DonHang;
    }
    
    
    
}
