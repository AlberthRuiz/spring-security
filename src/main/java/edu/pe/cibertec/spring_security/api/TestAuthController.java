package edu.pe.cibertec.spring_security.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestAuthController {
    @GetMapping("/hello")
    public String hello(){
        return  "Hello from rest controller";
    }
    @GetMapping("/hello-secured")
    public  String helloSecured(){
        return "Hello Secure from rest controller";
    }

}
