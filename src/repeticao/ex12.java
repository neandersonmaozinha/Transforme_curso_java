package repeticao;

import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int pares = 0;
		
		for(int i = 0; i < 20; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade "));
			int resto = num % 2;
			if (resto == 0)
			pares++;
							}
		JOptionPane.showMessageDialog(null, pares + " SÃO NÚMEROS PARES: ");
		}
			
		}