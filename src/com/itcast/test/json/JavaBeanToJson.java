package com.itcast.test.json;

import com.alibaba.fastjson.JSON;
import com.itcast.beans.Student;

public class JavaBeanToJson {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setId(1);
        stu1.setStudentName("张三");
        stu1.setStudentAge(10);
        String s = JSON.toJSONString(stu1);
        System.out.println(s);
    }
}
