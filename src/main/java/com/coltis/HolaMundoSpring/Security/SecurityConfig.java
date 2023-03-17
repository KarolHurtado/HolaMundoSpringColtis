/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coltis.HolaMundoSpring.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        
        auth.inMemoryAuthentication()
               .withUser("admin")
                .password("{noop}12345")
                .roles("ADMIN", "USER")
                .and()
                .withUser("user")
                .password("{noop}123")
                .roles("USER");

        
    }
    
     @Override
    protected void configure(HttpSecurity http) throws Exception{
        
        http.authorizeHttpRequests()
             .antMatchers("/editar/**", "/agregar/**", "/eliminar")
              .hasRole("ADMIN")
              .antMatchers("/")
              .hasAnyRole("USER", "ADMIN")
              .and()
              .formLogin()
              .loginPage("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403");
                

        
    }
    
}
