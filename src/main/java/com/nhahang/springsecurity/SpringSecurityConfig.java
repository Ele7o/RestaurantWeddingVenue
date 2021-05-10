/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author X_X
 */
@EnableWebSecurity
@EnableTransactionManagement
@ComponentScan(basePackages = "...")
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    private UserDetailsService taiKhoanDetailsService;
    
    @Bean 
    public BCryptPasswordEncoder matKhauEndcoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(taiKhoanDetailsService).passwordEncoder(matKhauEndcoder());
    }
    
    protected void configure(HttpSecurity http) throws Exception{
        http.formLogin().loginPage("/login").usernameParameter("tenTaiKhoan").passwordParameter("matKhau");
        http.formLogin().defaultSuccessUrl("/").failureUrl("login?error");
        http.logout().logoutSuccessUrl("/login");
        http.exceptionHandling().accessDeniedPage("/login?accessDenied");
        http.authorizeRequests().antMatchers("/")
                .permitAll().antMatchers("/**/add")
                .access("hasRole('ROLE_ADMIN')")
                .antMatchers("/**/pay")
                .access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
        http.csrf().disable();
    }
}


