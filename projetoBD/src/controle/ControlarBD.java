package controle;


import java.util.Scanner;


public class ControlarBD {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int opcao = -1;
	int menu = 0;
	int escolha = -1;
	while(menu  == 0) {
		System.out
		.println("\n\n### MENU DE OPCOES ###");
		System.out.println("\n\t\t=======================");
		System.out.println("\t\t|    1 - Cliente        |");
		System.out.println("\t\t|    2 - Fornecedor     |");
		System.out.println("\t\t|    0 - Sair           |");
		System.out.println("\t\t=========================");
		System.out.println("Insira a opcao: ");
		opcao = entrada.nextInt();
		System.out.print("\n");
		while(opcao == 1) {
			System.out
			.println("\n\n\t\t### MENU DE OPCOES - CLIENTE ###");
			System.out.println("\n\t\t============================");
			System.out.println("\t\t|    1 - Inserir Cliente     |");
			System.out.println("\t\t|    2 - Selecionar Clientes |");
			System.out.println("\t\t|    3 - Deletar Clientes    |");
			System.out.println("\t\t|    4 - Alterar Clientes    |");
			System.out.println("\t\t|    5 - Consultar Clientes  |");
			System.out.println("\t\t|    0 - Menu Principal      |");
			System.out.println("\t\t==============================\n");
			System.out.println("Insira a opcao: ");
			escolha = entrada.nextInt();
			System.out.print("\n");
//			switch (escolha) {
//				case 1:
//					//inserir dados
//					Inserir insert = new Inserir();
//					insert.inserirDados();
			if (escolha == 1) {
				Inserir insert = new Inserir();
				insert.inserirDados();
			} else if (escolha == 2) {
				SelecionarTodos selectTudo = new SelecionarTodos();
				selectTudo.selecionarTodosDados();
			} else if (escolha == 3) {
				Deletar delete = new Deletar();
				delete.deletarCadastro();
			} else if (escolha == 4) {
				Alterar alter = new Alterar();
				alter.alterarCadastro();
			} else if (escolha == 5) {
				Consultar consult = new Consultar();
				consult.consultarCadastro();
			} else if (escolha == 2) {
				
			} else if (escolha == 0) {
				System.out.println("Saindo!");
				break;
			} else {
				System.out.println("Opção Inválida!");
			}

				}
		while(opcao == 2) {
			System.out
			.println("\n\n### MENU DE OPCOES ###");
			System.out.println("\n\t\t=========================");
			System.out.println("\t\t|    1 - Inserir Fornecedor      |");
			System.out.println("\t\t|    2 - Selecionar Fornecedores |");
			System.out.println("\t\t|    3 - Deletar Fornecedor      |");
			System.out.println("\t\t|    4 - Alterar Fornecedor      |");
			System.out.println("\t\t|    5 - Consultar Fornecedor    |");
			System.out.println("\t\t|    0 - Menu Principal          |");
			System.out.println("\t\t=========================\n");
			System.out.println("Insira a opcao: ");
			escolha = entrada.nextInt();
			System.out.print("\n");
//			switch (escolha) {
//				case 1:
//					//inserir dados
//					Inserir insert = new Inserir();
//					insert.inserirDados();
			if (escolha == 1) {
				Inserir insert = new Inserir();
				insert.inserirDados();
			} else if (escolha == 2) {
				SelecionarTodos selectTudo = new SelecionarTodos();
				selectTudo.selecionarTodosDados();
			} else if (escolha == 3) {
				Deletar delete = new Deletar();
				delete.deletarCadastro();
			} else if (escolha == 4) {
				Alterar alter = new Alterar();
				alter.alterarCadastro();
			} else if (escolha == 5) {
				Consultar consult = new Consultar();
				consult.consultarCadastro();
			} else if (escolha == 2) {
				
			} else if (escolha == 0) {
				System.out.println("Saindo!");
				break;
			} else {
				System.out.println("Opção Inválida!");
			}

				}
		if (opcao == 0) {
			System.out.println("Obrigado por usar :)");
			break;
		}
	}
	}

}
	
	
	
