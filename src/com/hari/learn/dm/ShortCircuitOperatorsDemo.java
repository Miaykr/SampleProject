package com.hari.learn.dm;

public class ShortCircuitOperatorsDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        int p = i + j; // Operand, Operator

        if (!(i++ < 0) && ++i > 1) {
            System.out.println(i);
        }

        i++;
        i--;



        //System.out.println(i);
    }
}
