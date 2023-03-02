package condicional_simples;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do aluno");
		String nome = scan.next();
		
		System.out.println("Digite a nota 1: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota 2");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		
		if(media> 7) {
			System.out.println(nome +" Parabéns, foi aprovado com média: " + media);
			
		} else {
			System.out.println(nome + " infelizmente não foi aprovado, pois sua média foi de: " + media);
		}
		
		
		}
		

	}

