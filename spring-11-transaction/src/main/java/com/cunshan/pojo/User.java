package com.cunshan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.AutomapConstructor;

@Data
@AllArgsConstructor  //所有参数的有参构造
@NoArgsConstructor   //无参构造
public class User {
    private int id;
    private String name;
    private String pwd;
}
