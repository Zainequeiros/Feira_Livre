package com.ceuci.feiraLivre.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="endereco")
public class EnderecoModel {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotNull
	public String cep;
	
	@Column
	@NotNull
	public String endereco;
	
	@Column
	@NotNull
	public String numero;
	
	@Column
	@NotNull
	public String bairro;
	
	@Column
	@NotNull
	public String cidade;
	
	@Column
	@NotNull
	public String estado;
	
	@Column
	@NotNull
	public String pais;
	
	@ManyToOne
	@JsonIgnoreProperties("endereco")
	private UsuarioModel usuario;
	
	@ManyToOne
	@JsonIgnoreProperties("endereco")
	private ProdutorModel produtor;

	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public ProdutorModel getProdutor() {
		return produtor;
	}

	public void setProdutor(ProdutorModel produtor) {
		this.produtor = produtor;
	} 
	
}