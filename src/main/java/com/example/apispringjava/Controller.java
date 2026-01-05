package com.example.apispringjava;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping


public class Controller {
    @GetMapping("/boasVindas")

    public String Inicio()
        {
        return "Este é meu primeiro programa web com Spring Boot";
        }
}
