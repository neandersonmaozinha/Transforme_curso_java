package lista_sequencial;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2 Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de
		 * boasvindas para ela:
		 */

		String nome = JOptionPane.showInputDialog("Digite seu nome? ");
		JOptionPane.showMessageDialog(null, "Olá " + nome + ", é um prazer te conhecer!");

	}

}
