package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorDoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do produto "));
		double desconto = valorDoProduto*5/100;
		

		

		JOptionPane.showMessageDialog(null, "valor do produto é " + valorDoProduto + " Desconto de R$" + desconto + ". Valor do produto com desconto é de: R$" + (valorDoProduto - desconto));
	}

}
