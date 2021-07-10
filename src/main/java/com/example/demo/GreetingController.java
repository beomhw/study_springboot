package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// MVC 패턴이 특징
// Laravel과 마찬가지로 HTTP 요청은 controller에서 처리
@RestController
public class GreetingController {

    // template : 문자열 formatter
    private static final String template = "Hello, %s!";
    // Atomiclong : long 자료형의 Wrapping class
    // multi thread에서 synchronized 없이 사용 가능
    private final AtomicLong counter = new AtomicLong();
    
    // @ => 주석으로 식별
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(
            // AtomicLong.increamentAndGet => 고유 id 증가
            counter.incrementAndGet(),
            String.format(template, name)
        );
    }
}