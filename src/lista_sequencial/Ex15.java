package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex15 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade do carro?"));
		if(velocidade > 80)
			JOptionPane.showMessageDialog(null, "Você foi multado!!!  valor da multa de: " + ((velocidade - 80) *5.00));
			

	}	
	
}
