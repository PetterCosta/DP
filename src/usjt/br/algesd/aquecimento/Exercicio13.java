package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int[] numeros = new int[50];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o  " + (i + 1) + "º número: \n");
			numeros[i] = ent.nextInt();
		}

		int media = 0;
		for (int c = 0; c < numeros.length; c++) {
			media += numeros[c];
		}

		media = media / numeros.length;
		System.out.print("Média: " + media + "\n\n");

		String menorQueMedia = "";
		for (int c = 0; c < numeros.length; c++) {
			if (numeros[c] < media) {
				menorQueMedia += "" + numeros[c] + ", ";
			}
		}

		System.out.print("Números menores que a média: " + menorQueMedia.substring(0, (menorQueMedia.length() - 2)));

	}
}