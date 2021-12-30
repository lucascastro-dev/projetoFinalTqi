package com.github.lucascastrodev.projetoFinalTqi.dominio.servico;

import com.github.lucascastrodev.projetoFinalTqi.entities.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutenticacaoTeste {

    @Test
    public void autenticacao_sera_realizada_por_email_e_senha(){
        Cliente cliente = new Cliente();



        Assertions.assertNotNull(cliente.getEmail(), cliente.getSenha());
    }
}
