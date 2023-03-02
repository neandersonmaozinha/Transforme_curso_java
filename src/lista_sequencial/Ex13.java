package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário "));
		
		

		

		JOptionPane.showMessageDialog(null, "seu novo salário é de R$" + (salario * 1.15));
	}

}
