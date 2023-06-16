package com.example.gitgit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gitgit.Entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lilepingstart
 * @creat 2023-06-16 19:02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
