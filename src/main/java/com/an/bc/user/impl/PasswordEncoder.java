package com.an.bc.user.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoder {

    /**
     * Method to generate bcript 11 val hash.
     *
     * @param password to hash
     * @return hashed password
     */
    public String generateHash(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
