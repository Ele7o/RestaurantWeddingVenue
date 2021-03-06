/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.Sanh;
import java.util.List;

/**
 *
 * @author X_X
 */
public interface SanhService {
    List<Sanh> getSanh();
    List<Sanh> getSanh(String idSanh);
    List<Sanh> getSanhByState(String idSanh);
    Sanh getSanhById(int idSanh);
    boolean addOrUpdateSanh(Sanh sanh);
    boolean deleteSanh(int idSanh);
}
