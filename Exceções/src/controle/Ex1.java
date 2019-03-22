//ctrl + shift + o
package controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ex1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\Aluno\\eclipse-workspace\\Exceções\\dados.txt"); //lendo arquivo
			BufferedReader br = new BufferedReader(fr); //pega os dados
			
			String linha = "";
			while(linha != null) {
				linha = br.readLine();//lendo linhas, importante
				if(linha != null)
					System.out.println(linha);
				
			}
			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo" + e.getMessage());
		}
	}
	

}
 //escreve errado o endereço para ver o erro
//finally acontecendo ou não vai acontecer
//throw new illegalArgumentExeption();
