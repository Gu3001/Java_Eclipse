//2) Escreva um método que receba por parâmetro um array de inteiros e retorne todos
//os números pares armazenados no array.

public class RetornarPar {
	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7,8};
		for(int x = 0; x<vetor.length;x++) {
			if (vetor[x] % 2 == 0){
				System.out.println(vetor[x]);
			}
		}
	}
}
