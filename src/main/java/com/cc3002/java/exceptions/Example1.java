package com.cc3002.java.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {


    public void methodWithException(boolean b) throws E1, E2 {
        if (b) {
            throw new E1();
        } else {
            throw new E2();
        }
    }

    public void example(boolean b) {
        try {
            // Tried to execute a piece of code
            methodWithException(b);
        } catch (E1|E2 e) {
            // An error/event occurred and we can manage it
        } finally {
            // We must execute this part
        }
    }

    public void rethrow() {
        try {
            // code
        } catch (Exception e) {
            throw e;
        }
    }

    public void tryResources(String fileName) {
        try(FileInputStream file = new FileInputStream(fileName)) {
            // do things with file
        } catch (IOException e) {
            e.printStackTrace();
        }
        // the file is automatically closed when try exits
    }
}
