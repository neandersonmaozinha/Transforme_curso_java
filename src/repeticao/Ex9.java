package repeticao;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menorIdade = 0;
	    int idade = 0;
	    String nome = "";
	    String nomeMenor = "";
	    Scanner scan = new Scanner(System.in);


	    for (int i = 0; i < 10; i++) {
	        System.out.println("Digite a sua idade");
	        idade = scan.nextInt();
	         System.out.println("Digite p seu nome");
	        nome = scan.next();

	        if (menorIdade == 0 || idade < menorIdade) {
	            menorIdade = idade;
	            nomeMenor = nome;
	        }
	    }
	    System.out.println(nomeMenor + " possui a menor idade com: " + menorIdade + " anos ");
		

	}
}
