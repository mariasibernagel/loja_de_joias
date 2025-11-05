package com.senai.infoa.loja_de_joias.service;

import com.senai.infoa.loja_de_joias.Repositories.UsuarioRepository;
import com.senai.infoa.loja_de_joias.Models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

      @Autowired
    private UsuarioRepository usuarioRepository;
    
    public Long contador() {
        return  usuarioRepository.count();
        
    }

    public Usuario salvar (Usuario  usuario, String  confSenha){
        return  usuarioRepository.save(usuario);
    }

}

