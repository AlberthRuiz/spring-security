package edu.pe.cibertec.spring_security.api;

import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("/hello-secured2")
    public  String helloSecured2(){
        return "Hello Secure 2 from rest controller";
    }

}
