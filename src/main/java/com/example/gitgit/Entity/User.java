package com.example.gitgit.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author lilepingstart
 * @creat 2023-06-12 17:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

@TableName("user")
public class User {
    //主键自增
    @TableId(type = IdType.AUTO)
    String id;
    @TableField("username")
    String name;
    String password;
    String birthday;

}
