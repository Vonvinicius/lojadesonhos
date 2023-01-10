package ifrn.pi.lojadesonhos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String usuario;
	private String senha;
	
	@ManyToOne
	private Usuario nomedeusuario;
	
	
	public Usuario getNomedeusuario() {
		return nomedeusuario;
	}
	public void setNomedeusuario(Usuario nomedeusuario) {
		this.nomedeusuario = nomedeusuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", email=" + email + ", usuario=" + usuario + ", senha=" + senha + "]";
	}
}
