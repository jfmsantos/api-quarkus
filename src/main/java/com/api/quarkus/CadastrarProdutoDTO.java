package com.api.quarkus;

import java.math.BigDecimal;

import lombok.Data;

public @Data class CadastrarProdutoDTO {

	private String nome;

	private String descricao;

	private BigDecimal valor;

}
