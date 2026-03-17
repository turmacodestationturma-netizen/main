package Utils;

public class Pessoa {
	
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String  telefone;
	private String email;
	
	
	
	public Pessoa() {
	}
	 public Pessoa(String nome,String cpf,String datanascimento, String telefone, String email) {
		 
		 this.nome = nome;
		 this.cpf=cpf;
		 this.dataNascimento = datanascimento;
		 this.telefone = telefone;
		 this.email = email;
		 
	 }
	public String getNomecompleto() {
		return nome;
	}
	public void setNomecompleto(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
