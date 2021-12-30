package com.github.lucascastrodev.projetoFinalTqi.dominio.servico;

import com.github.lucascastrodev.projetoFinalTqi.entities.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CadastroDeClienteTeste {

    private CadastroDeCliente cadastroDeCliente;

    @Test
    public void o_cliente_deve_ter_dados_preenchidos(){
        Cliente cliente = new Cliente("Lucas",
                "email@email.com",
                "000.000.000-00",
                "00.000.000-00",
                "endereco",
                2000.,
                "senha");

        Assertions.assertNotNull(cliente);
    }
}
