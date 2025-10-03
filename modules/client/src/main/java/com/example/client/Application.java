package com.example.client;

import com.example.service.GreetingService;

public class Application {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        System.out.println(service.greet("World"));
    }
}
