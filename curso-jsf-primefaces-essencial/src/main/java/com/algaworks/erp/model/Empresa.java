package com.algaworks.erp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "nome_fantasia")
  private String nomeFantasia;
  @Column(name = "razao_social")
  private String razaoSocial;
  private String cnpj;
  @Column(name = "data_fundacao")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dataFundacao;
  @ManyToOne
  @JoinColumn(name = "ramo_atividade_id")
  private RamoAtividade ramoAtividade;

}
