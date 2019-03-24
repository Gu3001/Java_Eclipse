
package exercicios;
import java.util.HashMap;

public class NumExtenso {
	public static void main(String[] args) {
		HashMap<Character, String> nomesDigitos = new HashMap<Character, String>();
		nomesDigitos.put('0', "zero");
		nomesDigitos.put('1', "um");
		nomesDigitos.put('2', "dois");
		nomesDigitos.put('3', "tres");
		nomesDigitos.put('4', "quatro");
		nomesDigitos.put('5', "cinco");
		nomesDigitos.put('6', "seis");
		nomesDigitos.put('7', "sete");
		nomesDigitos.put('8', "oito");
		nomesDigitos.put('9', "nove");
		
		String entrada = "123451";
		for(int i =0; i < entrada.length(); i++) {
			String nomeDigito = nomesDigitos.get(entrada.charAt(i));
			
			if(i>0) 
				System.out.print(" ,");
			System.out.print(nomeDigito);
		}
		
	}                    
}
