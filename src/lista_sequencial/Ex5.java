package lista_sequencial;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		Double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		Double nota2 = scan.nextDouble();
		
		Double media = (nota1 + nota2)/2;
		
		System.out.println("Média: " + media);

	}

}
