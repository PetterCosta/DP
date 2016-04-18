package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int[] valores = new int[3];
		int menor;

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: \n");
			valores[i] = ent.nextInt();
		}

		menor = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < menor)
				menor = valores[i];
		}

		System.out.print("O menor valor é " + menor);
	}
}