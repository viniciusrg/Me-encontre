package classes;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private String cidadeAtual;
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
