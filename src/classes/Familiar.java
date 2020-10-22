package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.tool.hbm2ddl.UniqueConstraintSchemaUpdateStrategy;

@Entity(name = "Familiar")
public class Familiar extends Pessoa {
	

	
	private String email;
	
	
	private String telefone;
	
	
	private String cpfMorador;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpfMorador() {
		return cpfMorador;
	}
	public void setCpfMorador(String cpfMorador) {
		this.cpfMorador = cpfMorador;
	}
	
	
}
