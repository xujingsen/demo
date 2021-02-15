package com.example.demo.controller;

import com.example.demo.entity.B01User;
import com.example.demo.service.B01UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {



    @Autowired
    private B01UserService b01UserService;
    //查询
    @RequestMapping("/teacher")
    public List<B01User> getTeacher(){
        return  b01UserService.get();
    }

    //查询
    @RequestMapping("/find")
    public B01User findUser(){
       return  null;
    }


}
