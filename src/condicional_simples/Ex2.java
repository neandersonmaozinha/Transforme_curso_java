package condicional_simples;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNascimento = scan.nextInt();
		
		int idade = 2023 - anoNascimento;
		
		if (idade >= 16 && idade < 75) {
			System.out.println("pode votar");
		} else {
			System.out.println("Não pode votar");
		}
		

	}
}
