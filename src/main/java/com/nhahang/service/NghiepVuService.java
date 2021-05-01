package com.nhahang.service;

import com.nhahang.pojo.NghiepVu;

import java.util.List;
import java.util.Locale.Category;

public interface NghiepVuService {
    List<NghiepVu> getNghiepVu();
    NghiepVu getNghiepVuById(int idNghiepVu);
}
