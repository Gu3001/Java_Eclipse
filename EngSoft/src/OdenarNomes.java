// Escreva um programa que armazene em um array uma lista de nomes informados pelo 
// usuário. Em seguida, o programa deve ordenar a lista de nomes em ordem crescente
// (do menor para o maior). Dica: utilize a função Arrays.sort() para ordenar o array.
import java.util.Arrays;

public class OdenarNomes {
	public static void main(String[] args) {
		String nomes[] = {"João","Maria","José","Fabricio","Alberto"};
		
		Arrays.sort(nomes);
		for(int x=0; x<nomes.length;x++) {
			System.out.println(nomes[x]);
		}
		
			
	}
}
