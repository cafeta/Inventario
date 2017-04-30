package br.com.inventario.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private static final String USUARIO = "root";
	private static final String SENHA = "fbb123";
	private static final String URL = "jdbc:mysql://localhost:3306/sistema";

	public static Connection conectar() throws SQLException {
		Connection conexaoBD = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexaoBD;
	}

	public static void main(String[] args) {
		try {
			Connection conexaoBD = ConexaoBD.conectar();
			System.out.println("Conexão estabelecida ");
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("Conexão recusada");
		}

	}
}
