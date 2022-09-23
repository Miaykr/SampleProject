package com.hari.learn.casting;

public class CastingPrimitivesDemo {
    public static void main(String[] args) {
        int i = 10;
        long l = i;//Implict casting

        int i2 = (int) l; // Explict casting

        char ch = 'a';

        int i3 = ch;

        System.out.println(i3);

        //primitive Data types : byte, short, int, long, float, double, char (16), boolean

        //Class type: String

        //Integers : byte, short, int, long, char
        //Decimals : float, double

        System.out.println(i);
        System.out.println(l);
        System.out.println(i2);
    }
}
