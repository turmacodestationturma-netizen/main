package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Tabelas.Pessoa;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared;

public class PessoaDAO {
	private static final String JDBC_URL = "jdbc:h2:~/test";
	private static final String USER = "sa";
	private static final String PASS = "";

	public Pessoa buscarPessoaPorcpf(String cpf) {
		String sql = "SELECT *FROM PESSOA WHERE CPF = ?";

		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, cpf);

			try (ResultSet rs = ps.executeQuery()) {
				if (!rs.next()) {
					throw new RuntimeException("Pessoa não localizada pelo cpf " + cpf);

				}
				Pessoa p = new Pessoa();
				p.setNome(rs.getString("NOME"));
				p.setCpf(rs.getString("CPF"));
				p.setDatanascimento(rs.getString("DATA_NASCIMENTO"));
				p.setEmail(rs.getString("EMAIL"));
				p.setTelefone(rs.getString("TELEFONE"));

				return p;
			}

		} catch (SQLException e) {
			throw new RuntimeException("Erro ao consultar pessoa" + e.getMessage(), e);

		}
	}
}
