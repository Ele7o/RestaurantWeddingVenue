/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository;

import com.nhahang.pojo.DichVu;
import java.util.List;

/**
 *
 * @author btson
 */
public interface DichVuRepository {
    List<DichVu> getDichVus();
    DichVu getDichVuById(int idDichVu);
    boolean addOrUpdateDichVu(DichVu dichVu);
    boolean deleteDichVu(int idDichVu);
}
