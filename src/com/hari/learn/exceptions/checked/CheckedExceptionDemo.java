package com.hari.learn.exceptions.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws FileNotFoundException {
        handlingCheckedException();
    }

    static void handlingCheckedException() throws FileNotFoundException {
        FileInputStream GFG = new FileInputStream("resources/sample.txt");
    }


}
