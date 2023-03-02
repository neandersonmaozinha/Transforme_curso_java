package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mt = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

		double km = mt * 1000;
		double hm = mt * 100;
		double dam = mt * 10;
		double dm = mt / 10;
		double cm = mt / 100;
		double mm = mt / 1000;

		JOptionPane.showMessageDialog(null, km + "KM");
		JOptionPane.showMessageDialog(null, hm + "HM");
		JOptionPane.showMessageDialog(null, dam + "DAM");
		JOptionPane.showMessageDialog(null, dm + "DM");
		JOptionPane.showMessageDialog(null, cm + "CM");
		JOptionPane.showMessageDialog(null, mm + "MM");

	}

}
