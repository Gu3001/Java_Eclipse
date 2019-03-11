import java.util.ArrayList;
import java.util.Scanner;

public class testeLista {
	public static void main(String[]args) {
		
		for(int x =0; x < 3; x++) {
			Scanner scan = new Scanner(System.in);
			String nome = scan.next();
			nome = nome.toLowerCase();
		}
		
		ArrayList nomes = new ArrayList();
		nomes.add(nome);
		
		for(Object name : nomes) {
			System.out.println(name);
		}
		
	}
}
