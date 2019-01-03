package com.itcast.test.json;

import com.alibaba.fastjson.JSON;
import com.itcast.beans.Student;

import java.util.ArrayList;
import java.util.List;

public class JavaBeanToJson2 {
    public static void main(String[] args) {
        //简单对象
        Student stu1 = new Student();
        stu1.setId(1);
        stu1.setStudentName("张三");
        stu1.setStudentAge(10);

        Student stu2 = new Student();
        stu2.setId(2);
        stu2.setStudentName("李四");
        stu2.setStudentAge(12);

        //2.数组
        List<Student> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);

        //将List转换为JSON
        String jsonList = JSON.toJSONString(stuList);
        System.out.println(jsonList);
    }
}
