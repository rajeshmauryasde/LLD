package org.example.basic.v7_inheritance;

public class CannotFlyException extends Exception {
    public CannotFlyException(String message) {
        System.out.println(message);
    }
}
