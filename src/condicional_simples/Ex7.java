package condicional_simples;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Qual a distância da viagem? "));
		if(distancia <=200) {
			JOptionPane.showMessageDialog(null, "valor da passagem foi de " + (distancia*0.50));
			
		}else {
			JOptionPane.showMessageDialog(null, "valor da passagem foi de " + (distancia*0.45));
			
		}
		
		
		
		}
		

	}

