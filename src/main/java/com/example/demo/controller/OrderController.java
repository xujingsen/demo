package com.example.demo.controller;

import com.example.demo.entity.Teacher;
import com.example.demo.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    //查询
    @RequestMapping("/teacher")
    public List<Teacher> getTeacher(){
        return  orderService.get();
    }

    /*添加
    *  为什么添加的方法能在直接拿到前端添加的参数呢？
    *
    * */
    @PostMapping("/add")
    public List<Teacher> add(Teacher teacher){
        System.out.println("==================+==添加数据");
        orderService.add(teacher);
        return  getTeacher();

    }
    @RequestMapping("/del")
    public int add(int  Tid){
        System.out.println("==================+==删除数据=========================================");
        return    orderService.delter(Tid);

    }
   /* @RequestMapping("/del")
    @ResponseBody
    public void add(int  Tid){
        System.out.println("==================+==删除数据=========================================");
          orderService.delter(Tid);
     当用postman测试的时候。假如这个方法不用返回值，怎会报错。包了个视图解析器的错误。
     以上这个错误不知道为什么？
     等不用@ResponseBody注解的时候也会报错，因为postman要的是json数据，
    }*/
   @RequestMapping("/upd")
   public int update(Teacher  teacher){
       System.out.println("==================+==修改数据=========================================");
       return    orderService.upd(teacher);

   }
}
