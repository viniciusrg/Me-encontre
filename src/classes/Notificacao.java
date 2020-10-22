package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notificacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String nome;
	
	
	private String [] nomeFamiliar;
	
	
	private String email;
	
	
	private String cidadeAtual;
	
	
	private String informacaoAdicional;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getNomeFamiliar() {
		return nomeFamiliar;
	}
	public void setNomeFamiliar(String[] nomeFamiliar) {
		this.nomeFamiliar = nomeFamiliar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCidadeAtual() {
		return cidadeAtual;
	}
	public void setCidadeAtual(String cidadeAtual) {
		this.cidadeAtual = cidadeAtual;
	}
	public String getInformacaoAdicional() {
		return informacaoAdicional;
	}
	public void setInformacaoAdicional(String informacaoAdicional) {
		this.informacaoAdicional = informacaoAdicional;
	}
	
	
}
