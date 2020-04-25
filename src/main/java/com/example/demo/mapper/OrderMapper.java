package com.example.demo.mapper;

import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Teacher> getList();
    void add(Teacher teacher);
    int  del(int Tid);
    int upd(Teacher teacher);
}
