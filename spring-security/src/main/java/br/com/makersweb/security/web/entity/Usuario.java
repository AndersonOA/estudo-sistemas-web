/**
 * 
 */
package br.com.makersweb.security.web.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author anderson.aristides
 *
 */
@Entity
@Table(name = "tb_usuario")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Usuario extends DefaultEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7040978314125069193L;

	@NotBlank(message = "{br.com.finances.text.campo.nome.obrigatorio}")
	@Column(nullable = false)
	private String nome;

	@NotBlank(message = "{br.com.finances.text.campo.nome.obrigatorio}")
	@Column(nullable = false)
	private String sobrenome;

	@NotBlank(message = "{br.com.finances.text.campo.email.obrigatorio}")
	@Email
	@Column(nullable = false, unique = true)
	private String email;

	@NotNull(message = "{br.com.finances.text.campo.status.obrigatorio}")
	@Column(nullable = false)
	private Boolean status;

	@JsonIgnore
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
	private Autenticacao autenticacao;

	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "perfil_id")
	private Perfil perfils;

	@NotNull(message = "{br.com.finances.text.campo.enabled.obrigatorio}")
	@Column(nullable = false, columnDefinition = "BOOLEAN")
	private Boolean enabled;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome
	 *            the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the autenticacao
	 */
	public Autenticacao getAutenticacao() {
		return autenticacao;
	}

	/**
	 * @param autenticacao
	 *            the autenticacao to set
	 */
	public void setAutenticacao(Autenticacao autenticacao) {
		this.autenticacao = autenticacao;
	}

	/**
	 * @return the perfils
	 */
	public Perfil getPerfils() {
		return perfils;
	}

	/**
	 * @param perfils
	 *            the perfils to set
	 */
	public void setPerfils(Perfil perfils) {
		this.perfils = perfils;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
