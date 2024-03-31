package com.example.vika.service;

import com.example.vika.model.UserEntity;
import com.example.vika.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private BCryptPasswordEncoder encoder(){
        return new  BCryptPasswordEncoder();
    }
    public void save(UserEntity userEntity){
        userEntity.setPassword(encoder().encode(userEntity.getPassword()));
        userRepository.save(userEntity);

    }
}
