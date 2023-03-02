package condicional_simples;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano "));
		int resto = ano % 4;
		
		if(resto == 0){
			JOptionPane.showMessageDialog(null, ano + " é bissexto!!! ");
			
		}else{
			JOptionPane.showMessageDialog(null, ano + " não é bissexto!!! ");
			
		}
		
		
		}
		

	}

