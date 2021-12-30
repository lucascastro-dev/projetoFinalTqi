package com.github.lucascastrodev.projetoFinalTqi.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class client {
    private String name;
    private String email;
    private String cpf;
    private String rg;
    private String endereco;
    private Double renda;
    private String senha;

    @Override
    public String toString() {
        return "client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", endereco='" + endereco + '\'' +
                ", renda=" + renda +
                ", senha='" + senha + '\'' +
                '}';
    }
}
