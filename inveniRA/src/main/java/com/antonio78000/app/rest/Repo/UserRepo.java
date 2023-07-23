package com.antonio78000.app.rest.Repo;
import com.antonio78000.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository <User, Long>{
    
}
