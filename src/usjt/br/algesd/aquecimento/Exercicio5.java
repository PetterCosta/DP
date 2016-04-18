package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int n1;
		
		System.out.print("Digite um número: \n");
		n1 = ent.nextInt();

		String saida = "O número informado não é impar";

		if ((n1 % 2) != 0)
			saida = "O número informado é impar";

		System.out.print(saida);
	}
}