package com.example.demo.service.impl;

import com.example.demo.entity.B01User;
import com.example.demo.mapper.B01UserMapper;
import com.example.demo.service.B01UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class B01UserServiceImpl implements B01UserService {

    @Resource
    private B01UserMapper b01UserMapper;


    @Override
    public List<B01User> get() {
        return b01UserMapper.get();
    }
}