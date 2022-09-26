package com.hari.learn.exceptions;

import com.hari.learn.exceptions.checked.SomeCheckedException;

public class ThrowsClauseDemo {
    public static void main(String[] args) {

        try {
            checkingThrowsClause();
        } catch (SomeCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkingThrowsClause() throws SomeCheckedException {
        throw new SomeCheckedException("Some exception");
    }
}
