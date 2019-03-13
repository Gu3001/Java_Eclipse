import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3Professor {
	//public class RetornarNumExtenso {

	public static final List<Character> VOGAIS = Arrays.asList('a','e','i','o','u');
	
	public static String vogais (String nome) {
		String letrasVogais = "";
		
		
		for (char c : nome.toCharArray()) {
			if(VOGAIS.contains(Character.toLowerCase(c))) {
				letrasVogais +=c;
			}
		}
		return letrasVogais;
	}

	public static void main(String[] args) {
		
		String vogais = vogais("Willian");
		System.out.println(vogais);
	}

}


