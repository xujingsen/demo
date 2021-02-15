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


    //LOOk
    @RequestMapping("/aa")
    public B01User tt(){
        return  null;
    }

    //LOOk
    @RequestMapping("/bb")
    public B01User bb(){
        return  null;
    }

    //LOOk
    @RequestMapping("/cc")
    public B01User fint(){
        return  null;
    }

    //LOOk
    @RequestMapping("/dd")
    public B01User mouse(){
        return  null;
    }
      //LOOk
    @RequestMapping("/dd")
    public B01User dog(){
        return  null;
    }

}
