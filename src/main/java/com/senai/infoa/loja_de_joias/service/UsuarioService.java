package com.senai.infoa.loja_de_joias.service;

import com.senai.infoa.loja_de_joias.models.Usuario;
import com.senai.infoa.loja_de_joias.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public String login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email); // melhor separar por email, não por email+senha
        if (usuario != null) {
            if (senha.equals(usuario.getSenha())) {
                return "Login efetuado com sucesso!";
            } 
        else {
            return "Senha incorreta.";
        }
    }
    return "Usuário não encontrado.";
    }

    public Usuario salvar(Usuario usuario) {
        if (usuario.getSenha() == null || !usuario.getSenha().equals(usuario.getConfSenha())) {
            throw new RuntimeException("As senhas não coincidem!");
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Integer id, Usuario usuarioAtualizado) {
        Usuario usuarioExistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));

        usuarioExistente.setNome(usuarioAtualizado.getNome());
        usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        usuarioExistente.setSenha(usuarioAtualizado.getSenha());
        usuarioExistente.setCpf(usuarioAtualizado.getCpf());
        usuarioExistente.setEndereco(usuarioAtualizado.getEndereco());

        return usuarioRepository.save(usuarioExistente);
    }

    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado com o ID: " + id));
    }

}
