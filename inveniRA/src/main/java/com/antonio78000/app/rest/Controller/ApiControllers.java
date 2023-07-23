package com.antonio78000.app.rest.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonio78000.app.rest.Repo.UserRepo;
import java.util.List;

import com.antonio78000.app.rest.Dao.UserDao;
import com.antonio78000.app.rest.Models.User;



@RestController

public class ApiControllers {

    @RequestMapping(value="/users2")
    @GetMapping
    public User getPage(){
        User r=new User(); 
        r.setNome("Francisco");    
        r.setDataN("1991-01-02");
        r.setOcupacao("student");

        return r;

        }

    @RequestMapping(value="/users3")
    @PostMapping
    public void getPage2(@RequestBody User user){
        UserDao ud=new UserDao(); 
        ud.insertUser(user);
        }
        
    }

  

