package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dinheiroEmReais = Double
				.parseDouble(JOptionPane.showInputDialog("Digite quantos dinheirio em reais possui na carteira:"));

		JOptionPane.showMessageDialog(null, "Consegue comprar " + (dinheiroEmReais / 3.45) + " Dolares");

	}

}
