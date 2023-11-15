package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

//        obj.name = "john";
//        System.out.println(obj.name);
        //you might seen some error[

        // set the value using setter
        obj.setName("John");
        // Access the value using getter
        System.out.println(obj.getName());

    }
}