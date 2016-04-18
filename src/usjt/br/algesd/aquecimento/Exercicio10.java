package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int[] numeros = new int[50];
		int i = 0;

		do {
			System.out.print("Digite o " + (i + 1) + "º número: \n");
			numeros[i] = ent.nextInt();

			i++;
		} while (i < 10);

		int media = 0;

		for (int c = 0; c < numeros.length; c++) {
			media += numeros[c];
		}

		System.out.print("Média: " + (media / numeros.length));

	}
}