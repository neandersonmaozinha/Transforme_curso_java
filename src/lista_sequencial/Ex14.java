package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dias = Double.parseDouble(JOptionPane.showInputDialog("Quantos dias de aluguel?"));
		double km = Double.parseDouble(JOptionPane.showInputDialog("Quantos KM"));

		
	
JOptionPane.showMessageDialog(null, "Preço total: R$" + ((dias*90.00)+ (km* 0.20)));
	}

}
