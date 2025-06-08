package com.example.pessoaapi.controller;

import com.example.pessoaapi.model.Pessoa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final List<Pessoa> pessoas = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong();

    @GetMapping
    public List<Pessoa> listar() {
        return pessoas;
    }

    @PostMapping
    public Pessoa adicionar(@RequestBody Pessoa pessoa) {
        pessoa.setId(idGenerator.incrementAndGet());
        pessoas.add(pessoa);
        return pessoa;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa dados) {
        Optional<Pessoa> pessoaOpt = pessoas.stream().filter(p -> p.getId().equals(id)).findFirst();
        if (pessoaOpt.isPresent()) {
            Pessoa p = pessoaOpt.get();
            p.setNome(dados.getNome());
            p.setIdade(dados.getIdade());
            p.setCargo(dados.getCargo());
            return ResponseEntity.ok(p);
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) long id {
        boolean removido = pessoas.removeIf(p -> p.getId().equals(id));
        if (removido) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
