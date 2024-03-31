package com.example.vika.config;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
@AllArgsConstructor


public class Config {

  private  BCryptPasswordEncoder encoder() {
      return new BCryptPasswordEncoder();
  }


    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(req->req.
                requestMatchers("/registration").permitAll()
                .anyRequest().authenticated())

                .formLogin(form->form.loginPage("/login").permitAll())
                .logout(log->log.permitAll());
        return http.build();

    }
}
