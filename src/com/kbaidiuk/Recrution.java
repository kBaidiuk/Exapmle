package com.kbaidiuk;

public class Recrution {
    public static void print(int num) {
        System.out.println(num);
        num--;
        if (num >= 0)
        print(num);
    }
    public static void main(String [] args) {
        int num = 5;
        print(num);
    }
}
