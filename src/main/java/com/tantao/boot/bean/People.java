package com.tantao.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class People {

    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;

}
