package repeticao;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		



int soma = 0; 
for(int i = 0; i <20; i++) {
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade "));
	soma = soma + idade;
	
		}
JOptionPane.showMessageDialog(null,"SOMA DAS IDADES " +  soma);

}
	
}