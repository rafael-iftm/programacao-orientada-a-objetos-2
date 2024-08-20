package com.example.avioes.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.example.avioes.domain.Aviao;
import com.example.avioes.repository.AviaoRepository;

import java.util.*;

@RestController
@RequestMapping("/avioes")
public class AviaoController {

    private final AviaoRepository aviaoRepository;

    public AviaoController(AviaoRepository aviaoRepository) {
        this.aviaoRepository = aviaoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Aviao>> getAllAvioes() {
        List<Aviao> avioes = aviaoRepository.findAll();
        return ResponseEntity.ok(avioes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aviao> getAviaoById(@PathVariable Integer id) {
        Optional<Aviao> aviao = aviaoRepository.findById(id);
        return aviao.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Aviao> createAviao(@RequestBody Aviao aviao) {
        Aviao novoAviao = aviaoRepository.save(aviao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAviao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aviao> updateAviao(@PathVariable Integer id, @RequestBody Aviao aviao) {
        if (!aviaoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        aviao.setId(id);
        Aviao aviaoAtualizado = aviaoRepository.save(aviao);
        return ResponseEntity.ok(aviaoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAviao(@PathVariable Integer id) {
        if (!aviaoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        aviaoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
