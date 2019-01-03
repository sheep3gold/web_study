package com.itcast.test.json;

import com.alibaba.fastjson.JSON;
import com.itcast.beans.Course;
import com.itcast.beans.Student;

public class JavaBeanToJson3 {
    public static void main(String[] args) {
        //1.简单对象
        Student stu2 = new Student();
        stu2.setId(2);
        stu2.setStudentName("李四");
        stu2.setStudentAge(12);

        //3.复杂对象
        Course course = new Course();
        course.setId(1);
        course.setCourseName("英语");
        course.setCode("en");
        stu2.setCourse(course);

        //将复杂对象转换成JSON
        String string = JSON.toJSONString(stu2);
        System.out.println(string);
    }
}
