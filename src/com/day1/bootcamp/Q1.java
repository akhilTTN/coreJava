package com.day1.bootcamp;

import java.util.Scanner;

/**
 * Created by akhil on 15/3/17.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string_data=sc.next();
        System.out.println("Enter the string to find ");
        String s1=sc.next();
        System.out.println("Enter the string to replace ");
        String s2=sc.next();
        System.out.println("The String is before replace "+string_data);
        string_data=string_data.replace(s1,s2);
        System.out.println("The String is before replace  "+string_data);
    }
}
