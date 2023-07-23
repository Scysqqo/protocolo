package com.antonio78000.app.rest;

import com.antonio78000.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserR extends JpaRepository <User, Long>{
    
}
