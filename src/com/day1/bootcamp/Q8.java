package com.day1.bootcamp;

import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer.

public class Q8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String string=sc.next();
    StringBuffer sb=new StringBuffer(string);
        System.out.println("before reverse \n"+sb);
    sb=sb.reverse();
        System.out.println("after reverse "+sb);
    sb.replace(4,9,"");
        System.out.println("after removing index 4- 9 "+sb);
    }
}
