package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estacio")
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping("/insert/{valor}")
    public void insert (@PathVariable float valor){
        Objeto objeto = new Objeto(1, valor);
        repository.save(objeto);
    }

    @GetMapping("/get")
    public float beberAgua(){
        return repository.getById(1).getPercentual();
    }
}
