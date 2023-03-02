package repeticao;

import javax.swing.JOptionPane;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maioresDeIdade = 0; 
		for(int i = 0; i < 20; i++) {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade "));
			if(idade > 8)
			maioresDeIdade++;
			
				}
		JOptionPane.showMessageDialog(null,"SÃO MAIORES QUE OITO: " +  maioresDeIdade);
		}
			
		}