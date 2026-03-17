package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By btnAbraSuaConta = By.xpath("//button");
	private By campoNome = By.id("name");
	private By campotelefone = By.name("celular");
	private By campoEmail = By.name("email");
	private By campoCpf = By.name("cpf");
	private By campoDataNascimento = By.name("dataNascimento");
	
	
	public By getBtnAbraSuaConta() {
		return btnAbraSuaConta;
	}


	public By getCampoNome() {
		return campoNome;
	}


	public By getCampotelefone() {
		return campotelefone;
	}


	public By getCampoEmail() {
		return campoEmail;
	}


	public By getCampoCpf() {
		return campoCpf;
	}


	public By getCampoDataNascimento() {
		return campoDataNascimento;
	}

}
