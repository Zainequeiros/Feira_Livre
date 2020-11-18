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
@Table(name = "usuario")
public class UsuarioModel {

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
	public String telefone;
	
	@Column
	@NotNull
	public String cpf;
	
	@Column
	@NotNull
	public String dataNascimento;
	
	@OneToMany(mappedBy="usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<EnderecoModel> endereco;
	
	@OneToMany(mappedBy="usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<PedidoModel> pedido;
	
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<EnderecoModel> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoModel> enderecoUsuario) {
		this.endereco = enderecoUsuario;
	}
	
}
