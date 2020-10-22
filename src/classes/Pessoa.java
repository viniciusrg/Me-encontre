package classes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String nome;
	
	
	private int idade;
	
	
	private String cpf;
	
	
	private String cidadeAtual;
	
	@Column(name="nomeFamiliar")
	@ElementCollection(targetClass=String.class)
	private List<String> nomeFamiliar = new ArrayList<>();
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCidadeAtual() {
		return cidadeAtual;
	}
	public void setCidadeAtual(String cidadeAtual) {
		this.cidadeAtual = cidadeAtual;
	}
	public List<String> getNomeFamiliar() {
		return nomeFamiliar;
	}
	public void setNomeFamiliar(String nomeFamiliar) {
		this.nomeFamiliar.add(nomeFamiliar);
	}

	
	
}
