package com.example;

public class App {
    public String getGreeting() {
        return "Hello, GitHub Actions!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
