package controle;

import javax.swing.JOptionPane;

public class InputDeDados {
	public String nome;
	public int rg;
	public int cpf;
	public int telefone;
	public Cidade cidade;
	
	public String inserirNomeAntigo() {
		String nomeAntigo = JOptionPane.showInputDialog("Insira o nome Antigo ");
		return nomeAntigo;
	}
		
	public void GetInserirNome(int nome) {
		this.nome = JOptionPane.showInputDialog("Insira seu Nome: ");
//		return nome;
	}
	public int inserirRG() {
		String rgString = JOptionPane.showInputDialog("Insira seu RG: ");
		rg = Integer.parseInt(rgString);
		return rg;
	}
	public int inserirCPF() {
		String cpfString = JOptionPane.showInputDialog("Insira seu CPF: ");
		cpf = Integer.parseInt(cpfString);
		return cpf;
	}
	public int inserirTelefone() {
		String foneString = JOptionPane.showInputDialog("Insira seu telefone: : ");
		telefone = Integer.parseInt(foneString);
		return telefone;
	}
	public String inserirResposta() {
		String resposta = JOptionPane.showInputDialog("Quer inserir novamente? (S) para sim e (N) para não ");
		resposta = resposta.toLowerCase();

		return resposta;
	}


//duas entidades,uma classe para o banco 


//	}
}
