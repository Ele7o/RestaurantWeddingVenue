/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.controllers;

import com.nhahang.service.DichVuService;
import com.nhahang.service.DonHangService;
import com.nhahang.service.DonHang_DichVuService;
import com.nhahang.service.KhachHangService;
import com.nhahang.service.NghiepVuService;
import com.nhahang.service.NhanVienService;
import com.nhahang.service.NhanVien_DonHangService;
import com.nhahang.service.PhanHoiService;
import com.nhahang.service.SanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author btson
 */
@RestController
@RequestMapping("/api")
public class ApiNhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired 
    private KhachHangService khachHangService;
    @Autowired 
    private DichVuService dichVuService;
    @Autowired
    private DonHangService donHangService;
    @Autowired
    private NghiepVuService nghiepVuService;
    @Autowired
    private PhanHoiService phanHoiService;
    @Autowired
    private SanhService sanhService;
    @Autowired
    private DonHang_DichVuService donHang_dichVuService;
    @Autowired
    private NhanVien_DonHangService nhanVien_donHangService;
    
    @DeleteMapping("/nhanvien/{idNhanVien}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNhanVien(@PathVariable(name="idNhanVien")int idNhanVien){
        this.nhanVienService.deleteNhanVien(idNhanVien);
    }
    
    @DeleteMapping("/khachhang/{idKhachHang}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteKhachHang(@PathVariable(name="idKhachHang")int idKhachHang){
        this.khachHangService.deleteKhachHang(idKhachHang);
    }
    
    @DeleteMapping("/dichvu/{idDichVu}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDichVu(@PathVariable(name="idDichVu")int idDichVu){
        this.dichVuService.deleteDichVu(idDichVu);
    }
    
    @DeleteMapping("/donhang/{idDonHang}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDonHang(@PathVariable(name="idDonHang")int idDonHang){
        this.donHangService.deleteDonHang(idDonHang);
    }
    
    @DeleteMapping("/nghiepvu/{idNghiepVu}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNghiepVu(@PathVariable(name="idNghiepVu")int idNghiepVu){
        this.nghiepVuService.deleteNghiepVu(idNghiepVu);
    }
    
    @DeleteMapping("/phanhoi/{idPhanHoi}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePhanHoi(@PathVariable(name="idPhanHoi")int idPhanHoi){
        this.phanHoiService.deletePhanHoi(idPhanHoi);
    }
    
    @DeleteMapping("/sanh/{idSanh}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSanh(@PathVariable(name="idSanh")int idSanh){
        this.sanhService.deleteSanh(idSanh);
    }
    @DeleteMapping("/dhdv/{idDonHangDichVu}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDonHangDichVu(@PathVariable(name="idDonHangDichVu")int idDonHangDichVu){
        this.donHang_dichVuService.deleteDonHangDichVu(idDonHangDichVu);
    }
    @DeleteMapping("/nvdh/{idNhanVienDonHang}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNhanVienDonHang(@PathVariable(name="idNhanVienDonHang")int idNhanVienDonHang){
        this.nhanVien_donHangService.deleteNhanVienDonHang(idNhanVienDonHang);
    }
}
