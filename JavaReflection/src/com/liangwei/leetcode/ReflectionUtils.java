package com.liangwei.leetcode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * java 反射工具类
 * Created by liangwei on 2017/3/18.
 */
public class ReflectionUtils {

    /**
     * 使用反射方式获取实例对象owner内名为filedName的属性对象
     * @param owner  实例对象
     * @param filedName  属性名
     * @return   属性对象
     * @throws Exception
     */
    public static Object getProperty(Object owner,String filedName) throws Exception{

        Class ownerClass = owner.getClass();
        Field[] fields = ownerClass.getFields();
        Field[] fields1 = ownerClass.getDeclaredFields();
        Field field = ownerClass.getDeclaredField(filedName);
        field.setAccessible(true);
        Object property = field.get(owner);

        return property;
    }


    /**
     * 获取某个类的静态属性
     * @param className  类名（可以位简单类名或者为全限定类名）
     * @param fiedName   属性名
     * @return  属性对象
     * @throws Exception
     */
    public static Object getStaticProperty(String className,String fiedName) throws  Exception{

        Class ownerClass = Class.forName(className);
        Field field = ownerClass.getField(fiedName);
        Object property = field.get(ownerClass);
        return property;
    }

    /**
     * 执行某个对象的方法
     * @param owner  对象实例
     * @param methodName 方法名称
     * @param args 方法的参数名
     * @return 执行的结果
     * @throws Exception
     */
    public static Object invokeMethod(Object owner,String methodName,Object[] args) throws Exception{

        Class ownerClass = owner.getClass();
        Class[] argsClass = new Class[args.length];
        for(int i=0;i<args.length;i++){
            argsClass[i] = args[i].getClass();
        }
        Method method = ownerClass.getMethod(methodName,argsClass);
        return method.invoke(owner,args);
    }

    /**
     * 执行某个类的静态方法
     * @param className 类名
     * @param methodName 方法名
     * @param args 参数数组
     * @return 执行结果
     * @throws Exception
     */
    public static Object invokeStaticMethod(String className,String methodName,Object[] args) throws Exception{

        Class ownerClass = Class.forName(className);
        Class[] argsClass = new Class[args.length];
        for(int i=0;i<args.length;i++){
            argsClass[i] = args[i].getClass();
        }
        Method method = ownerClass.getMethod(methodName,argsClass);
        return method.invoke(null,argsClass);
    }

    /**
     * 新建一个类实例
     * @param className 类名
     * @param args 构造器参数
     * @return 新建的实例
     * @throws Exception
     */
    public static Object newInstance(String className,Object[] args) throws Exception{

        Class newOneClass = Class.forName(className);
        Class[] argsClass = new Class[args.length];
        for(int i=0;i<args.length;i++){
            argsClass[i] = args[i].getClass();
        }
        Constructor constructor = newOneClass.getConstructor(argsClass);
        return constructor.newInstance(args);
    }

    /**
     * 判断该实例是否是由该class实例化的
     * @param obj  实例
     * @param cls  类
     * @return true 是
     *         false 否
     */
    public static boolean isInstance(Object obj,Class cls){
        return cls.isInstance(obj);
    }
}
