package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDAO {

	public Pessoa buscarPessoaPorCpf(String cpf) throws SQLException {

		String sql = "SELECT NOME,CPF,DATA_NASCIMENTO,TELEFONE,EMAIL FROM PESSOA WHERE CPF =?";

		try (Connection conn = ConexaoH2.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, cpf);

			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					Pessoa pessoa = new Pessoa();
					pessoa.setNomecompleto(rs.getString("NOME"));
					pessoa.setCpf(rs.getString("CPF"));
					pessoa.setDataNascimento(rs.getString("DATA_NASCIMENTO"));
					pessoa.setTelefone(rs.getString("TELEFONE"));
					pessoa.setEmail(rs.getString("EMAIL"));
					return pessoa;
				}

			} catch (SQLException e) {
				throw new RuntimeException("Erro ao buscar dados");
			}
 return null;
		}

	}
}
