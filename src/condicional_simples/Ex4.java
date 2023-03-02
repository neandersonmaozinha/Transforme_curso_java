package condicional_simples;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
		int resto = numero % 2;
		
		if(resto == 0){
			JOptionPane.showMessageDialog(null, numero + " é par!!! ");
			
		}else{
			JOptionPane.showMessageDialog(null, numero + " é impar!!! ");
			
		}
		
		
		
		}
		

	}

