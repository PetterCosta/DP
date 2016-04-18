package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		float n1, n2;
		String tot;

		System.out.print("Digite o preço/Kg e a quantidade de Kgs: \n");
		n1 = ent.nextFloat();
		n2 = ent.nextFloat();

		if (n2 <= 0) {
			tot = "Quantidade de Quilos insuficiente para cálculo";
		} else {
			tot = "" + (n2 * n1);
		}

		String saida = "O total a ser pago para " + (n2) + " Quilo(s) é:\n";
		saida += "R$ " + tot;
		saida += "\nFim.";

		System.out.print(saida);
	}
}