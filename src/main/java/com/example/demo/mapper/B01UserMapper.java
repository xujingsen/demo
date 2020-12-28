package com.example.demo.mapper;

import com.example.demo.entity.B01User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface B01UserMapper {
    List<B01User> get();
 }
