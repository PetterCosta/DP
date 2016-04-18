package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: \n");
			numeros[i] = ent.nextInt();
		}

		for (int c = (numeros.length - 1); c >= 0; c--) {
			System.out.print("" + numeros[c] + "\n");
		}

	}
}