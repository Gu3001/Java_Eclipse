
//3) Escreva um método que receba por parâmetro um nome e retorne as letras do nome que são vogais. 
//Dica: utilize o método toCharArray()​ da String​.
import javax.swing.JOptionPane;
public class RetornarVogais {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Insira seu nome: ");
		nome.toLowerCase(); // caixa Baixa
		
		//retornar as letras que são vogais
		char[] arrayDeNome = nome.toCharArray();
		
		for (int x =0; x<arrayDeNome.length; x++) {
			
			if(arrayDeNome[x] == 'a' || arrayDeNome[x] == 'e' || arrayDeNome[x] == 'i' ||
			arrayDeNome[x] == 'o' || arrayDeNome[x] == 'u' ) {
				System.out.println(arrayDeNome[x]);
			}  
		}
	}
}
