package com.senai.infoa.loja_de_joias.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.senai.infoa.loja_de_joias.Models.Usuario;
import com.senai.infoa.loja_de_joias.service.UsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario, @RequestParam String senha, @RequestParam String confSenha) {
        return usuarioService.salvar(usuario, senha, confSenha);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email, senha);
    }
    
}




