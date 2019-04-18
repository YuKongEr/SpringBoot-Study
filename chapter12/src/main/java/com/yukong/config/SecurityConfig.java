package com.yukong.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author yukong
 * @date 2019-04-11 15:08
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.formLogin()
//                .loginPage("/panda-signIn.html")
//                .loginProcessingUrl("/authentication/form")
//                .failureUrl("/login?error")
//                .and()
//                .authorizeRequests()
//                .antMatchers(new String[]{"/static/**","/js/**","/css/**","/img/**","/images/**","/fonts/**","/**/favicon.ico"})
//                .permitAll()
//                .antMatchers("/panda-signIn.html")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//        .csrf().disable();
//    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // 配置UserDetailsService 跟 PasswordEncoder 加密器
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
        auth.eraseCredentials(false);
    }
}
