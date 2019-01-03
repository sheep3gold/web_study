package com.itcast.test.json;

import com.alibaba.fastjson.JSON;
import com.itcast.beans.Student;

import java.util.HashMap;
import java.util.Map;

public class MapToJson {
    public static void main(String[] args) {
        //简单对象
        Student stu2 = new Student();
        stu2.setId(2);
        stu2.setStudentName("李四");
        stu2.setStudentAge(12);

        Map<String, Object> map = new HashMap<>();
        map.put("code", "1001");
        map.put("stu", stu2);

        String s = JSON.toJSONString(map);
        System.out.println(s);
    }
}
