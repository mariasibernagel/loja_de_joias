package com.senai.infoa.loja_de_joias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.loja_de_joias.models.Endereco;
import com.senai.infoa.loja_de_joias.service.EnderecoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

    @GetMapping("/buscarendereco/{id}")
    public Endereco buscarPorId(@PathVariable Integer id) {
        return enderecoService.buscarPorId(id);
    }

    @GetMapping("/listar")
    public List<Endereco> listarTodos() {
        return enderecoService.listarTodos();
    }

}
