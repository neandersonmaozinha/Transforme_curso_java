package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex10 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
			double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura"));

			double area = altura * largura;
			double quantidadeTinta = area / 2;
		
	JOptionPane.showMessageDialog(null, "Área do imóvel é de: " + area + " metros quadrados. e quantidade tinta necéssaria é de " + quantidadeTinta + "." );
		
	}

}
