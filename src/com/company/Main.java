package com.company;

public class Main {

    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println(result);

        int res_a = 0, a = 5;
        int res_b = 0, b = 8;

        res_a = a-- -  --a + ++a + a++ + a;
        res_b = ++b - b++ + ++b - --b;

        System.out.println(res_a);
        System.out.println(res_b);


    }
}
