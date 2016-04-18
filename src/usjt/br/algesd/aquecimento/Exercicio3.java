package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int n1, n2;

		System.out.print("Digite dois valores para saber o maior entre eles: \n");
		n1 = ent.nextInt();
		n2 = ent.nextInt();

		String saida = "Resposta:\n";

		if (n2 > n1) {
			saida += "O maior número é " + n2;
		} else {
			saida += "O maior número é " + n1;
		}

		saida += "\nFim.";

		System.out.print(saida);
	}
}