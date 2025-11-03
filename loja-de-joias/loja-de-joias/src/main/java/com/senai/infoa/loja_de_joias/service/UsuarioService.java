package com.senai.infoa.loja_de_joias.service;

import com.senai.infoa.loja_de_joias.Repositories.UsuarioRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.loja_de_joias.Models.usuario;

@Service

public class UsuarioService {

      @Autowired
    private UsuarioRepository usuarioRepository;
    
    public Long contador() {
        return  usuarioRepository.count();
        
    }

    public usuario salvar (usuario  usuario){
        return  usuarioRepository.save(usuario);
    }

}
