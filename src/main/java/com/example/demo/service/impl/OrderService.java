package com.example.demo.service.impl;

import com.example.demo.entity.Teacher;
import com.example.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService implements com.example.demo.service.OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Teacher> get() {
        return orderMapper.getList();
    }

    @Override
    public void add(Teacher teacher) {
        orderMapper.add(teacher);
    }

    @Override
    public int delter(int Tid) {
      return   orderMapper.del(Tid);
    }

    @Override
    public int upd(Teacher teacher) {
        return orderMapper.upd(teacher);
    }
}
