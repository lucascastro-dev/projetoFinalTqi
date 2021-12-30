package com.github.lucascastrodev.projetoFinalTqi.dominio.servico;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class EmprestimoTeste {

    @Test
    public void emprestimo_nao_pode_nulo() {

        try {
            new Emprestimo(null, LocalDateTime.now(), 10, LocalDateTime.now().plusMonths(4));
            Assertions.fail();
        } catch (Exception exception) {
            Assertions.assertEquals(exception.getMessage(), "O valor é obrigatório.");
        }
    }

    @Test
    public void emprestimo_nao_pode_ser_igual_a_zero() {
        try {
            new Emprestimo(0., LocalDateTime.now(), 10, LocalDateTime.now().plusMonths(4));
            Assertions.fail();
        } catch (Exception exception) {
            Assertions.assertEquals(exception.getMessage(), "O valor é obrigatório.");
        }
    }

    @Test
    public void data_do_emprestimo_eh_obrigatoria() {

        try {
            new Emprestimo(10., null, 10, LocalDateTime.now().plusMonths(4));
            Assertions.fail();
        } catch (Exception exception) {
            Assertions.assertEquals(exception.getMessage(), "A data é obrigatória.");
        }
    }

    @Test
    public void quantidade_de_parcelas_eh_obrigatorio() {
        try {
            new Emprestimo(10., LocalDateTime.now(), null, LocalDateTime.now().plusMonths(4));
            Assertions.fail();
        } catch (Exception exception) {
            Assertions.assertEquals(exception.getMessage(), "A quantidade de parcelas é obrigatória.");
        }
    }

    @Test
    public void quantidade_de_parcelas_maximas_eh_60() {
        try {
            new Emprestimo(10., LocalDateTime.now(), -10, LocalDateTime.now().plusMonths(4));
            Assertions.fail();
        } catch (Exception exception) {
            Assertions.assertEquals(exception.getMessage(), "O máximo de parcelas são 60.");
        }
    }

    @Test
    public void data_da_primeira_parcela_nao_pode_ser_menor_que_a_data_atual() {
        try {
            LocalDateTime dataAnteriorAdataAtual = LocalDateTime.now().plusMonths(2);
            new Emprestimo(10., LocalDateTime.now(), 60, dataAnteriorAdataAtual);
            Assertions.fail();
        } catch (Exception exception) {
            Assertions.assertEquals(exception.getMessage(), "A data da primeira parcela não deve ser anterior a data atual.");
        }
    }

    @Test
    public void data_da_primeira_parcela_nao_pode_ser_apos_3_meses_da_data_atual(){

    }

    @Test
    public void quando_valor_e_data_e_quantidade_de_parcelas_for_valido() {
        Double valorSolicitado = 10.;
        LocalDateTime dataDoEmprestimo = LocalDateTime.now();
        int quantidadeDeParcelas = 10;
        LocalDateTime dataDaPrimeiraParcela = LocalDateTime.now().plusMonths(4);
        Emprestimo emprestimo = new Emprestimo(valorSolicitado, dataDoEmprestimo, quantidadeDeParcelas, dataDaPrimeiraParcela);
        Assertions.assertEquals(emprestimo.getValor(), valorSolicitado);
        Assertions.assertEquals(emprestimo.getData(), dataDoEmprestimo);
        Assertions.assertEquals(quantidadeDeParcelas, emprestimo.getQuantidadeDeParcelas());
        Assertions.assertEquals(emprestimo.getDataDaPrimeiraParcela(), dataDaPrimeiraParcela);
    }
}
