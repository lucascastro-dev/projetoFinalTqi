package com.github.lucascastrodev.projetoFinalTqi.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private String endereco;
    private Double renda;
    private String senha;

    public Cliente(String nome, String email, String cpf, String rg, String endereco, Double renda, String senha) {
        if (nome == null || nome.isEmpty())
            throw new RuntimeException("Nome é obrigatório!");
        if (email == null || email.isEmpty())
            throw new RuntimeException("E-mail é obrigatório!");
        if (cpf == null || cpf.isEmpty())
            throw new RuntimeException("CPF é obrigatório!");
        if (rg == null || rg.isEmpty())
            throw new RuntimeException("RG é obrigatório!");
        if (endereco == null || endereco.isEmpty())
            throw new RuntimeException("Endereço é obrigatório!");
        if (renda == null)
            throw new RuntimeException("Renda é obrigatória!");
        if (senha == null || senha.isEmpty())
            throw new RuntimeException("Senha é obrigatória!");

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.renda = renda;
        this.senha = senha;
    }
}
