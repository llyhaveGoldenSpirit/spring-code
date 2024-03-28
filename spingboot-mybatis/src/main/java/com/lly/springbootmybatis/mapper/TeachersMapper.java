package com.lly.springbootmybatis.mapper;

import com.lly.springbootmybatis.pojo.Teachers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeachersMapper {
    @Select("select * from teachers where tid = #{id}")
    public Teachers findById(Integer id);
}
