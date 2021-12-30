package com.github.lucascastrodev.projetoFinalTqi.dominio.servico;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Emprestimo {
    private Double valor;
    private LocalDateTime data;
    private Integer quantidadeDeParcelas;
    private LocalDateTime dataDaPrimeiraParcela;

    public Emprestimo(Double valor, LocalDateTime data, Integer quantidadeDeParcelas, LocalDateTime dataDaPrimeiraParcela) {

        if (valor == null || valor == 0.) {
            throw new RuntimeException("O valor é obrigatório.");
        }

        if (data == null) {
            throw new RuntimeException("A data é obrigatória.");
        }

        if (quantidadeDeParcelas == null) {
            throw new RuntimeException("A quantidade de parcelas é obrigatória.");
        }

        if (quantidadeDeParcelas < 1 || quantidadeDeParcelas > 60) {
            throw new RuntimeException("O máximo de parcelas são 60.");
        }

        LocalDateTime dataLimiteDaPrimeiraParcela = LocalDateTime.now().plusMonths(4);
        LocalDateTime dataAtual = LocalDateTime.now();
        if (dataLimiteDaPrimeiraParcela.isBefore(dataAtual) || dataDaPrimeiraParcela.isAfter(dataLimiteDaPrimeiraParcela)) {
            throw new RuntimeException("A data da primeira parcela não deve ser anterior a data atual.");
        }

        this.valor = valor;
        this.data = data;
        this.quantidadeDeParcelas = quantidadeDeParcelas;
        this.dataDaPrimeiraParcela = dataDaPrimeiraParcela;
    }
}
