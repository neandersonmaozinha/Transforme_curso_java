package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
		
		JOptionPane.showMessageDialog(null, "O funcionário " + nome + " tem um salário de R$ " + salario + " em Fevereiro de 2023. ");

	}

}
