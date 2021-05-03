package com.nhahang.repository;

import com.nhahang.pojo.NghiepVu;
import com.nhahang.pojo.NhanVien;

import java.util.List;

public interface NghiepVuRepository {
    List<NghiepVu> getNghiepVu();
    NghiepVu getNghiepVuById(int idNghiepVu);
    
}
