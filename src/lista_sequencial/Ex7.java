package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número Real"));
		
		JOptionPane.showMessageDialog(null, "O dobro de: " + numero + " é " + (numero * 2) + 
				                      ".\n A terça parte de " + numero + " é " + (numero/3));
				                       


	}

}
