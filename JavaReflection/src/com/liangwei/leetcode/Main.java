package com.liangwei.leetcode;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //1.测试获取实例的属性
        Person person = new Person("张三","男",175);
        try {
            Object property = ReflectionUtils.getProperty(person,"gender");
            System.out.println(property);
            if(ReflectionUtils.isInstance(property,String.class)){
                String gender = (String)property;
                gender = "女";
                System.out.println(person.getGender());
            }
            System.out.println(person.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Class personClass = person.getClass();
        try {
            Field field = personClass.getDeclaredField("height");
            Class type = field.getType();
            //System.out.println(type);
            field.setAccessible(true);
            int age = field.getInt(person);
            System.out.println(age);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String name = person.getClass().getCanonicalName();
        System.out.println(name);
    }
}
