/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service;

import com.nhahang.pojo.Mon;
import java.util.List;

/**
 *
 * @author X_X
 */
public interface MonService {
    List<Mon> getMon();
    Mon getMonById(int idMon);
    boolean addOrUpdateMon(Mon mon);
}
