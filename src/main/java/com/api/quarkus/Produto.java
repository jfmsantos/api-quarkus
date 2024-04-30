package com.api.quarkus;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

@Entity
@Table(name = "PRODUTO")

public @Data class Produto extends PanacheEntity {


	private String nome;

	private String descricao;

	private BigDecimal valor;

    @CreationTimestamp
    private Date dataCriacao;

    @UpdateTimestamp
    private Date dataAtualizacao;

}
