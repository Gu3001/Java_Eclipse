package exercicios;

import java.util.ArrayList;

public class RetornarPares {
	public static ArrayList<Integer> numerosPares(int[] numeros){
		ArrayList<Integer> retorno = new ArrayList<Integer>();
		for(int num : numeros) {
			if(num % 2 == 0) {
				retorno.add(num);
			}
		}
		return retorno;
	}
	public static void main(String[] args) {
		int[] numeros = new int[] {10,2,100,6,90,3,1};
		
		ArrayList<Integer> numerosPares = numerosPares(numeros);
		System.out.println(numerosPares);
	}
}



