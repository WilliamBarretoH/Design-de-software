package br.com.alura.rh.service.validacao;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface Validacao {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
