/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository;

import com.nhahang.pojo.Sanh;
import java.util.List;

/**
 *
 * @author X_X
 */
public interface SanhRepository {
    List<Sanh> getSanh();
    Sanh getSanhById(int idSanh);
    boolean addOrUpdateSanh(Sanh sanh);
}
