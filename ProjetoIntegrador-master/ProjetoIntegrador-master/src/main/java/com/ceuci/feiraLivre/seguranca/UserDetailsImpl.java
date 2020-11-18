package com.ceuci.feiraLivre.seguranca;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ceuci.feiraLivre.model.UsuarioModel;

public class UserDetailsImpl implements UserDetails, Serializable {

	private static final long serialVersionUID = 1L;

	//ATRIBUTOS
	private String userName;
	private String password;
	
	
	//CONSTRUTORES
	public UserDetailsImpl() {
	}
	
	public UserDetailsImpl(UsuarioModel user) {
		this.userName = user.getNome();
		this.password = user.getSenha();
	}

	//MÉTODOS
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
