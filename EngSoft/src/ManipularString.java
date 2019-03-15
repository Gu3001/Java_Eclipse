//5) FaÃ§a um programa que, a partir de uma string digitada pelo usuÃ¡rio, imprima:
//O nÃºmero de caracteres da string.
//A string com todas suas letras em maiÃºsculo.
//O nÃºmero de vogais da string.
//Se a string digitada comeÃ§a com â€œIFâ€� (ignorando maiÃºsculas/minÃºsculas).
//Se a string digitada termina com â€œPRâ€� (ignorando maiÃºsculas/minÃºsculas).
//O nÃºmero de dÃ­gitos (0 a 9) da string.
//Se a string Ã© um palÃ­ndromo ou nÃ£o

import java.util.Arrays;
import java.util.Scanner;

public class ManipularString {
	public static void main(String[] args) {
		
		System.out.println("Insira uma palavra");
		Scanner scan = new Scanner(System.in);
		String palavra = scan.next();
		palavra = palavra.toLowerCase();
		
		//tamanho da palavra
		System.out.println("O tamanho da String Ã© "+palavra.length());
		//todas letras Maiusculas
		System.out.println(palavra.toUpperCase());
		//vogais----------------------------------------------------
		
		int contador = 0;
		char letras[] = palavra.toCharArray();
		
		for(int x=0; x<palavra.length(); x++) {
			if(letras[x] =='a' ||letras[x] =='e' ||letras[x] =='i' ||letras[x] =='o' ||letras[x] =='u') {
				contador++;
			}
		}
		System.out.println("Tem "+contador+" vogais");
		//ComeÃ§a com IF
		
		if(letras[0] == 'i' && letras[1] == 'f') {
			System.out.println("Sim, comeÃ§a com IF");
		}
		
		//Termina com PR - arrumar utilizer length e length-1
		if(letras[(letras.length)-2] == 'p' && letras[(letras.length)-1] == 'r') {
			System.out.println("Sim, termina com PR");
		}
		
		//O nÃºmero de dÃ­gitos (0 a 9) da string.
		int cont = 0;
		for(int x=0; x<palavra.length();x++) {
			 if(letras[x]=='0' || letras[x]=='1' || letras[x]=='2' || letras[x]=='3' ||
				letras[x]=='4' || letras[x]=='5' || letras[x]=='6' || 
				letras[x]=='7' || letras[x]=='8' || letras[x]=='9') {
				cont++; 
			 }
		 }
		System.out.println("Existem "+cont+" numeros na String");
		
		//Se a string Ã© um palÃ­ndromo ou nÃ£o.
		char invertido[] = palavra.toCharArray(); 
		
		String palindrome = "";
		int meio = palavra.length() / 2;
		for(int i=0; i<meio; i++) {
			if(palavra.charAt(i) != palavra.charAt(palavra.length()-1 -i)){
				palindrome = "Nao e palindrome";
			}else {
				palindrome = "E palindrome";
			}
		}
		System.out.println(palindrome);
		
		//--------------------------------------------------------------------------
		String nome = "willian";
		String nomeInvertido = "";
		
		for(int i = nome.length()-1; i>=0; i--) {
			nomeInvertido += nome.charAt(i);
		}
		System.out.println(nomeInvertido);
	
	}
}
