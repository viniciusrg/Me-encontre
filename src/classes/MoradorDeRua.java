package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "MoradorDeRua")
public class MoradorDeRua extends Pessoa {

	public MoradorDeRua() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	private String cidadeNatal;
	
	
	private String informacoesAdicionais;
	
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}
	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}
	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	
	
}
