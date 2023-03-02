package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite p valor de A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite p valor de B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite p valor de C"));

		int delta = (b * b) - (4 * a * c);

		JOptionPane.showMessageDialog(null, "valor de delta : " + delta);
	}

}
