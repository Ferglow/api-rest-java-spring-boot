package com.example.medicamentos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MedicamentosController {




    @GetMapping("/")
    public String prueba(){
        return  "Hola Fernando";
    }

}
