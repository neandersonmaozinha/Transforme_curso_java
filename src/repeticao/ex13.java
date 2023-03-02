package repeticao;

import javax.swing.JOptionPane;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ContagemDeOa100 = 0;
		
		for(int i = 0; i < 20; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
			if (num >= 0 && num <=100)
			 ContagemDeOa100++;
							}
		JOptionPane.showMessageDialog(null,  ContagemDeOa100 + " SÃO NÚMEROS DE ZERO A 100: ");
		}
			
		}
		
		