package com.day1.bootcamp;

import java.util.Scanner;

/**
 * Created by akhil on 15/3/17.
 */

//Write a program to find the number of occurrences of a character in a string without using loop?


public class Q3 {

    private int charOccurance(String s,char char_to_find,int count){
        if(s.length()==0)
            return count;
        else
        {
            if(s.charAt(0)==char_to_find){
                count++;
                return charOccurance(s.substring(1),char_to_find,count);
            }
            else
                return charOccurance(s.substring(1),char_to_find,count);
        }
    }

    public static void main(String[] args) {
        Q3 ob = new Q3();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(ob.charOccurance(s,'a',0));
    }
}
