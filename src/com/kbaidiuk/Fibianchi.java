package com.kbaidiuk;

public class Fibianchi {
    public static int fib(int num) {
        if (num > 1) {
            return fib(num - 1) + fib(num - 2);
        } else if (num == 1) {
            return 1;
        } else return 0;

    }
    public static void main(String[] args) {
        System.out.println(fib(6)); // 5

    }
}
