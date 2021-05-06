package com.nhahang.repository;

import com.nhahang.pojo.NghiepVu;

import java.util.List;

public interface NghiepVuRepository {
    List<NghiepVu> getNghiepVu();
    NghiepVu getNghiepVuById(int idNghiepVu);

    boolean addOrUpdateNghiepVu(NghiepVu nghiepVu);
    

}
