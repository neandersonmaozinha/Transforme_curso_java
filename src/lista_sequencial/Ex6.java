package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		JOptionPane.showMessageDialog(null, "Antecessor: " + (numero - 1) + "\n número: " + numero 
				                       + "\n Sucessor: "   + (numero + 1));
		


	}

}
