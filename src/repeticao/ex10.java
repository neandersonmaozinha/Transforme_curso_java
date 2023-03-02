package repeticao;

import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String tabuada = "";
int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));



for(int i = 1; i <=10; i++) {
	tabuada += (numero + " x " + i + " = " + (numero * i) + "\n" );
	
	
		}
JOptionPane.showMessageDialog(null, tabuada);
}
	
}