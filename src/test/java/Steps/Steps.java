package Steps;

import java.sql.SQLException;

import Elementos.Elementos;
import Metodos.Metodos;
import Utils.MassaDados;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que acesse o banco {string}")
	public void que_acesse_o_banco(String url) {
		m.abrirNavegador(url);
	}

	@When("selecionar o botao abra sua conta")
	public void selecionar_o_botao_abra_sua_conta() throws InterruptedException {
		m.pausa(5000);
      m.clicar(e.getBtnAbraSuaConta());
	}
	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() throws InterruptedException {
		m.escrever(e.getCampoNome(),MassaDados.pessoa.getNomecompleto() );
		

	}
	@When("busco  no banco da dados pelo {string}")
	public void busco_no_banco_da_dados_pelo(String cpf) throws SQLException {
	   Utils.PessoaDAO dao = new Utils.PessoaDAO();
	   Utils.MassaDados.pessoa = dao.buscarPessoaPorCpf(cpf);
	   
	   
	   if (Utils.MassaDados.pessoa ==null) {
		throw new RuntimeException("Pessoa nao encontrada no banco pelo CPF"+ cpf);
	}
	   System.out.println("Dados carregados do banco ");
	   System.out.println("NOME" + Utils.MassaDados.pessoa.getNomecompleto());
	}
	@When("selecionar o checkbox de termos de aceite")
	public void selecionar_o_checkbox_de_termos_de_aceite() {

	}

	@Then("o botao continuar deve estar visivel")
	public void o_botao_continuar_deve_estar_visivel() {

	}

}
