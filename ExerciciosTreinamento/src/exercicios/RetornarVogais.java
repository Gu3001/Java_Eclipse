//3) Escreva um método que receba por parâmetro um nome e retorne as letras do nome que são vogais. 
//Dica: utilize o método toCharArray()​ da String​.
package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class RetornarVogais {
	
	public static final List<Character> VOGAIS = Arrays.asList('a','e','i','o','u');
	
	public static String vogais(String nome) {
		String letrasVogais="";
		
		for(char c : nome.toCharArray()) {
			if(VOGAIS.contains(Character.toLowerCase(c))) {
				letrasVogais+=c;
			}
		}
		return letrasVogais;
	}
	
	
	
	
	public static void main(String[] args) {
		String vogais = vogais("willian");
		System.out.println(vogais);
	}
}
