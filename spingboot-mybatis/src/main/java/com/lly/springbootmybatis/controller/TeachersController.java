package com.lly.springbootmybatis.controller;

import com.lly.springbootmybatis.pojo.Teachers;
import com.lly.springbootmybatis.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeachersController {
    @Autowired
    private TeachersService teachersService;

    @RequestMapping("/findById")
    public Teachers findById(Integer id){
        return teachersService.findById(id);
    }
}
