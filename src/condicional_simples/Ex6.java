package condicional_simples;



import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano "));
		int idade = 2023 - ano;
		
		if(idade <= 18){
			int falta = 18-idade;
			JOptionPane.showMessageDialog(null, "faltam: " + falta + " anos para o alistamento. ");
			
		}else{
			int passou = idade -18;
			JOptionPane.showMessageDialog(null, "faz: " + passou + " anos que realizou o alistamento. ");
			
		}
		
		
		}
		

	}

