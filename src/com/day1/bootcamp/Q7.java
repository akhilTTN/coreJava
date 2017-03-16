package com.day1.bootcamp;

/**
 * Created by akhil on 16/3/17.
 */

//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

public class Q7 {
    private static String fname="akhil";
    private static String lname="rawat";
    private static int age=24;
    static {
        System.out.println("My first name is "+fname);
    }
    static void getLname(){
        System.out.println("My last name is "+lname);
    }
    public static void main(String[] args) {
        Q7.getLname();
        System.out.println("My age is "+age);
    }
}

