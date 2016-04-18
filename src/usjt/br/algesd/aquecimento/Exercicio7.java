package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int n1;

		System.out.print("Digite o código do produto: \n");
		n1 = ent.nextInt();

		if (n1 == 1) {
			System.out.println("Parafuso");
		} else if (n1 == 2) {
			System.out.println("Porca");
		} else if (n1 == 3) {
			System.out.println("Prego");
		} else {
			System.out.println("Diversos");
		}
	}
}