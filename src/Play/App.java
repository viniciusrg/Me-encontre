package Play;

import classes.MoradorDeRua;
import classes.Pessoa;
import classes.Familiar;
import classes.Contato;
import classes.Notificacao;

import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
		MoradorDeRua morador = new MoradorDeRua();
		morador.setNome("Matheus");
		morador.setCidadeAtual("Alfenas");
		morador.setCpf("11122233344");
		morador.setIdade(25);
		morador.setCidadeNatal("Areado");
		morador.setNomeFamiliar("Xico");
		morador.setInformacoesAdicionais("Nenhuma.");
		
		Familiar familia = new Familiar();
		familia.setNome("Joao");
		familia.setIdade(20);
		familia.setEmail("joao@joao.com");
		familia.setCidadeAtual("Varginha");
		familia.setTelefone("35988888888");
		familia.setCpf("11111111111");
		familia.setCpfMorador("22222222222");
		familia.setNomeFamiliar("Xicao");
		familia.setNomeFamiliar("Tiao");
		
		Contato cont = new Contato();
		cont.setNome("Raimundo");
		cont.setEmail("raimundo@gmail.com");
		cont.setMensagem("Estou procurando meu irmao, Matheus!");
		
		
		System.out.println("Informação do morador cadastrado:");
		
		System.out.println("Nome: " + morador.getNome());
		System.out.println("Cidade atual: " + morador.getCidadeAtual());
		System.out.println("Idade: " + morador.getIdade());
		System.out.println("Cidade natal: " + morador.getCidadeNatal());
		System.out.println("Cpf: " + morador.getCpf());
		System.out.println("Nome dos familiares: " + morador.getNomeFamiliar());
		System.out.println("Informações adicionais: " + morador.getInformacoesAdicionais());
		
		
		System.out.println();
		System.out.println("Informações do familiar cadastrado:");
		
		System.out.println("Nome: " + familia.getNome());
		System.out.println("Email: " + familia.getEmail());
		System.out.println("Cidade atual: " + familia.getCidadeAtual());
		System.out.println("Telefone: " + familia.getTelefone());
		System.out.println("Idade: " + familia.getIdade());
		System.out.println("Cpf: " + familia.getCpf());
		System.out.println("Cpf do morador: " + familia.getCpfMorador());
		System.out.println("Nome do morador: " + familia.getNomeFamiliar());
		
		System.out.println();
		System.out.println("Formulário para contato:");
		
		System.out.println("Nome: "+ cont.getNome());
		System.out.println("Email: " + cont.getEmail());
		System.out.println("Mensagem: " + cont.getMensagem());
		
	}

}
