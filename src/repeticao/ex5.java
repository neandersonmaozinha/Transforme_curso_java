package repeticao;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		



int soma = 0; 
for(int i = 0; i <10; i++) {
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
	soma = soma + numero;
	
		}
JOptionPane.showMessageDialog(null, soma);
}
	
}