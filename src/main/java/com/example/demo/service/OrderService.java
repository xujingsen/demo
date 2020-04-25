package com.example.demo.service;

import com.example.demo.entity.Teacher;

import java.util.List;

public interface OrderService {
   List<Teacher> get();
   void add(Teacher teacher);
   int  delter(int Tid);
   int upd(Teacher teacher);
}
