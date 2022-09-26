package com.hari.learn.exceptions.checked;

public class SomeCheckedException extends Exception {
    public SomeCheckedException(String message) {
        super(message);
    }

    public SomeCheckedException() {
        super();
    }
}
