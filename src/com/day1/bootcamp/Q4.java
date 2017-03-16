package com.day1.bootcamp;

import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lower_case = 0, upper_case = 0, special_chars = 0, digits = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lower_case++;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upper_case++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digits++;
            } else
                special_chars++;
        }
        System.out.println("No of lowercase characters are "+ lower_case+" & percentage of lowercase character are "+(((double)lower_case/s.length()))*100);
        System.out.println("No of upercase characters are "+ upper_case+" & percentage of lowercase character are "+((double)upper_case/s.length()*100));
        System.out.println("No of digit characters are "+ digits+" & percentage of lowercase character are "+((double)digits/s.length()*100));
        System.out.println("No of special characters are "+ special_chars+" & percentage of lowercase character are "+((double)special_chars/s.length()*100));
    }
}
