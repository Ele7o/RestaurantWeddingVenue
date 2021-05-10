/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.validator;

import com.nhahang.pojo.TaiKhoan;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author X_X
 */
@Component
public class PassValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return TaiKhoan.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        TaiKhoan taiKhoan = (TaiKhoan) target;
        if(!taiKhoan.getMatKhau().trim().equals(taiKhoan.getXacThucMatKhau().trim()))
            errors.rejectValue("password", "user.password.error.notMatchMsg");
    }
    
    

}
