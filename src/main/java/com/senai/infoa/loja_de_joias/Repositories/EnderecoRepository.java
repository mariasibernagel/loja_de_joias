package com.senai.infoa.loja_de_joias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.loja_de_joias.models.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    @Query(value = "select * from endereco where logradouro = :logradouro and localidade = :localidade and cep = :cep and numero = :numero and complemento = :complemento and bairro = :bairro and referencia = :referencia", nativeQuery = true)
    public Endereco findByUsuario(String logradouro, String localidade, Integer cep, Integer numero, String complemento, String bairro, String referencia);
}