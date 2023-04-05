package br.com.terceiroperiodo.controller;

import br.com.terceiroperiodo.model.Estado;
import br.com.terceiroperiodo.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    EstadoService estadoService;

    @PostMapping()
    public ResponseEntity<Estado> salvarEstado(@RequestBody Estado estado){

        Estado response = estadoService.save(estado);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Estado>> buscarTodos(){

        List<Estado> response = estadoService.buscarTodos();
        return ResponseEntity.ok(response);
    }
}
