package br.com.inventario.DAO;

import java.sql.PreparedStatement;

import java.sql.Connection;

import java.sql.SQLException;

import br.com.inventario.conexao.ConexaoBD;
import br.com.inventario.domain.Fornecedores;

public class FornecedoresDAO {
	public void salvar(Fornecedores f) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO fornecedores");
		sql.append("(descricao)");
		sql.append("VALUES(?)");
		
		Connection conexaoBD = ConexaoBD.conectar();
		PreparedStatement comando = conexaoBD.prepareStatement(sql.toString());
		comando.setString(1,f.getDescricao());
		comando.executeUpdate();
		
	}
	public static void main(String[] args) {
		Fornecedores f1 = new Fornecedores();
		f1.setDescricao("DESCRIÇAO1");
		
		Fornecedores f2 = new Fornecedores();
		f2.setDescricao("DESCRIÇAO2");
		
		Fornecedores f3 = new Fornecedores();
		f3.setDescricao("DESCRIÇAO2");
		
		
		
		FornecedoresDAO fdao = new FornecedoresDAO();
		try {
			fdao.salvar(f1);
			fdao.salvar(f2);
			fdao.salvar(f3);
			System.out.println("salvo com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("erro ao salvar!");
			
			e.printStackTrace();
		}

	}
		
	
}
