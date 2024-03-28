package com.lly.springbootmybatis.service.impl;

import com.lly.springbootmybatis.mapper.TeachersMapper;
import com.lly.springbootmybatis.pojo.Teachers;
import com.lly.springbootmybatis.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeachersServiceImpl implements TeachersService {
    @Autowired
    private TeachersMapper teachersMapper;
    @Override
    public Teachers findById(Integer id) {
        return teachersMapper.findById(id);
    }
}
