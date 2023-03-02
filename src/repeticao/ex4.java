package repeticao;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String nome = JOptionPane.showInputDialog("Digite o seu nome");	
int vezes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes que repita? "));


for(int i = 0; i <vezes; i++) {
	System.out.println(nome);
	
		}

}
	
}