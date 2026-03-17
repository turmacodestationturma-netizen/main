package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoH2 {

	private static final String URL = "jdbc:h2:~/test";
	private static final String USUARIO = "sa";
	private static final String SENHA = "";

	public static Connection conectar() throws SQLException {

		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Driver não encontrado", e);

		} catch (SQLException e) {
			throw new RuntimeException("Erro ao conectar no banco h2",e);
		}

	}

}
