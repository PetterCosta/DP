package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int n1;
		
		System.out.print("Digite um n�mero: \n");
		n1 = ent.nextInt();

		String saida = "O n�mero informado n�o � impar";

		if ((n1 % 2) != 0)
			saida = "O n�mero informado � impar";

		System.out.print(saida);
	}
}