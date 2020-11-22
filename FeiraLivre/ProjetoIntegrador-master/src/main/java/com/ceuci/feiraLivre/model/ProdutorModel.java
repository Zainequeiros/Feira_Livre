package com.ceuci.feiraLivre.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="produtor")
public class ProdutorModel {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotNull
	public String nome;
	
	@Column
	@NotNull
	public String email;
	
	@Column
	@NotNull
	public String senha;
	
	@Column
	@NotNull
	public String cnpj;
	
	@Column
	@NotNull
	public String telefone;
	
	@OneToMany(mappedBy="produtor", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produtor")
	private List<EnderecoModel> endereco;

	@OneToMany(mappedBy="produtor", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produtor")
	private List<ProdutoModel> produtos;
	
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<EnderecoModel> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoModel> endereco) {
		this.endereco = endereco;
	}

}
