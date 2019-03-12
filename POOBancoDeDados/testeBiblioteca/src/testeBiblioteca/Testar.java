package testeBiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

import controle.VerificarPar;

public class Testar {
	public static void main(String[] args) {
		VerificarPar p1 = new VerificarPar();
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		
		String user = "root";
		
		try {
			
		Connection conn = DriverManager.getConnection(url, user,"");
		Statement st = conn.createStatement();
		

		
		String resposta = "s";
		while(resposta.equals("s")){
			resposta = JOptionPane.showInputDialog("Insira dua resposta S ou N");
			
			if (resposta.equals("n")){
				break;
			}
			
			String nome = JOptionPane.showInputDialog("Insira o Nome do Estado");
			String sigla = JOptionPane.showInputDialog("Insira a sigla do Estado");
			st.executeUpdate("INSERT INTO ESTADO(NOME,SIGLA) VALUES('"+nome+"','"+sigla+"')");
			

		}
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
//categoria, deseja inserir outro???, id nome descição