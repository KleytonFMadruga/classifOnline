package com.projeto.classifOnLine.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name= "CANDIDATO")
public class Candidato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private   Integer id;
	private   String  nome;
	private   String  cpfOuCnpj;
	private   String  email;
	private   String  login;
	protected String  senha;
	
	
	
//	@OneToMany(mappedBy = "candidato", cascade = CascadeType.ALL)
//	private List<Curriculo> curriculos = new ArrayList<>();
//	
//	@OneToMany(mappedBy = "candidato", cascade = CascadeType.ALL)
//	private List<Endereco> enderecos = new ArrayList<>();
//	
//	@ElementCollection
//	@CollectionTable(name = "TELEFONE_CANDIDATO")
//	private Set<String> telefones = new HashSet<>();
	
	public Candidato() {
		// TODO Auto-generated constructor stub
	}

	public Candidato(Integer id, String nome, String cpfOuCnpj, String email, String login,
			String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpfOuCnpj = cpfOuCnpj;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//	public List<Endereco> getEndereco() {
//		return enderecos;
//	}
//
//	public void setEndereco(List<Endereco> enderecos) {
//		this.enderecos = enderecos;
//	}
//
//	public Set<String> getTelefones() {
//		return telefones;
//	}
//
//	public void setTelefones(Set<String> telefones) {
//		this.telefones = telefones;
//	}
//
//	
//	public List<Curriculo> getCurriculo() {
//		return curriculos;
//	}
//
//	public void setCurriculo(List<Curriculo> curriculos) {
//		this.curriculos = curriculos;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Candidato other = (Candidato) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
	
	
	
}