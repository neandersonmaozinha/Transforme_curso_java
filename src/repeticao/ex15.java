package repeticao;

import javax.swing.JOptionPane;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma = 0; 
		int controlador = 0;

				do {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
				soma+= num;
				controlador = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? +"
												+ "\n 1 para sim"
				                                                                + "\n -1 para não"));
				}while (controlador > 0);
 
				JOptionPane.showMessageDialog(null, "Soma: " + soma);
				
		}
			
		}


		