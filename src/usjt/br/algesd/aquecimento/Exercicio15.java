package usjt.br.algesd.aquecimento;

public class Exercicio15 {
	public static void main(String args[]) {

		int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };

		int n = a.length;

		int b[] = new int[n];
		int i;

		String saida = "Resposta: ";

		for (i = 0; i < n; i++) {
			b[i] = a[n - i - 1];

			saida += a[n - i - 1] + " ";
		}

		System.out.println(saida);
		System.exit(0);
	}
}