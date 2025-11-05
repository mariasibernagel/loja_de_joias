package com.senai.infoa.loja_de_joias.service;

import com.senai.infoa.loja_de_joias.Repositories.UsuarioRepository;
import com.senai.infoa.loja_de_joias.Models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario, String senha, String confSenha) {
        if (senha.equals(confSenha)) {
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public String login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByUsuario(email, senha);
        if (usuario != null && senha.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar o login";
    }
}
