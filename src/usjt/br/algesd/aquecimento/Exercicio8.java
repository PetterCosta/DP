package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int n1;

		System.out.print("Digite o código do produto: \n");
		n1 = ent.nextInt();

		switch (n1) {
		case 1:
			System.out.println("Parafuso");
			break;

		case 2:
			System.out.println("Porca");
			break;

		case 3:
			System.out.println("Prego");
			break;

		default:
			System.out.println("Diversos");
			break;
		}
	}
}