package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		int n1, n2;
		String tot;

		System.out.print("Digite o preço e o valor pago do produto: \n");
		n1 = ent.nextInt();
		n2 = ent.nextInt();

		if (n2 < n1) {
			tot = "Valor insuficiente para pagamento.";
		} else {
			tot = "" + (((n1 - n2) < 0) ? ((n1 - n2) * (-1)) : (n1 - n2));
		}

		String saida = "Troco:\n";
		saida += "R$ " + tot;
		saida += "\nFim.";

		System.out.print(saida);

	}
}