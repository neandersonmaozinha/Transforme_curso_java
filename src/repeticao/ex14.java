package repeticao;

import javax.swing.JOptionPane;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int ContagemDeOa100 = 0;
	int ContagemDe101a200 = 0;
	int ContagemAcimaDe200 = 0;
		
		for(int i = 0; i < 3; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
		
			if (num >= 0 && num <= 100)
			 ContagemDeOa100++;
			 
			 if(num >=101 && num <= 200)
				 ContagemDe101a200++;
			 
			 if(num >=201)
				 ContagemAcimaDe200++;
							}
		JOptionPane.showMessageDialog(null,  ContagemDeOa100 + " de 0 a 100: " + "\n" + ContagemDe101a200 + " de 101 a 200 \n" + ContagemAcimaDe200 + " acima de 200"); 
		}
			
		}
		