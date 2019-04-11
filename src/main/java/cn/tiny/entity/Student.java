package cn.tiny.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author tiny
 * @date 2018/12/20 10:57
 */
@Data

public class Student {

    private Long id;
    private Integer studentId;
    private String name;
    private String age;
    private String sex;
    private Date birthDay;

}
