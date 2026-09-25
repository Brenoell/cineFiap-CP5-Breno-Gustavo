package br.com.fiap.cineFiap.controller;

import br.com.fiap.cineFiap.models.Sala;
import br.com.fiap.cineFiap.service.SalaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {
    private SalaService salaService = new SalaService();


    @GetMapping
    public List<Sala> listar(){
        System.out.println("Teste se entra na Controller");
        return salaService.listar();
    }



}