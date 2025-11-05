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

    @GetMapping("/count")
    public Long contador() {
        return usuarioService.contador();
    }

    @PostMapping("salvar")
    public Usuario salvar(@RequestBody Usuario usuario, @RequestParam String confSenha ) {
        if (usuario.getSenha().equals(confSenha)){
            return usuarioService.salvar(usuario, confSenha);
        } else{
            return null;
        }
    }
    
    
}


