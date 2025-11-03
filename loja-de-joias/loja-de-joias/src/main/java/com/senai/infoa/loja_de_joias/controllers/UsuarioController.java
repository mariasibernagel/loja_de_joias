package com.senai.infoa.loja_de_joias.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.senai.infoa.loja_de_joias.Models.usuario;
import com.senai.infoa.loja_de_joias.service.UsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/count")
    public Long contador() {
        return usuarioService.contador();
    }

    @PostMapping("salvar")
    public usuario salvar(@RequestBody usuario usuario) {
        return usuarioService.salvar(usuario);
    }
    
    
}


