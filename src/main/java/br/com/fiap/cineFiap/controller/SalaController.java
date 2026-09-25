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

    @GetMapping("/{id}") /*Buscar sala por ID CONTROLER*/
    public ResponseEntity<Sala> buscarPorId(@PathVariable Long id){
        var sala = salaService.listarPorId(id);
        if(sala.getId() != null)
            return ResponseEntity.ok(sala);
        return ResponseEntity.notFound().build();
    }

}