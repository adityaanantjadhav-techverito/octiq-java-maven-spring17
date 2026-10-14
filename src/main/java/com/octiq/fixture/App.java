package com.octiq.fixture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello from octiq fixture";
    }

    @GetMapping("/customers")
    public List<Customer> customers() {
        return List.of(
                new Customer(1L, "Alice Johnson", "alice@example.com"),
                new Customer(2L, "Bob Smith", "bob@example.com"),
                new Customer(3L, "Carol White", "carol@example.com")
        );
    }

    public record Customer(Long id, String name, String email) {
    }
}
