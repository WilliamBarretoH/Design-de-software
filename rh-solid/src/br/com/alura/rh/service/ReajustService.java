package br.com.alura.rh.service;

import br.com.alura.rh.service.validacao.Validacao;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajustService {

    private List<Validacao> validacoes;

    public ReajustService(List<Validacao> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
