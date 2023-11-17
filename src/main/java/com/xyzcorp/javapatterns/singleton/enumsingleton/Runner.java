package com.xyzcorp.javapatterns.singleton.enumsingleton;

public class Runner {
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.equals(singleton2));
    }
}
