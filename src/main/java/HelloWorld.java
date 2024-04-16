package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(new HelloWorld().getMessage());
    }

    public String getMessage() {
        return "Hello, World!";
    }
}

