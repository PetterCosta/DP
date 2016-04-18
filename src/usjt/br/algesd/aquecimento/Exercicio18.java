package usjt.br.algesd.aquecimento;

public class Exercicio18 {
	public static void main(String args[]) {
		int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
		int n = a.length;
		int b[] = new int[n];

		String saida = "Resposta: ";

		for (int i = 0; i < (n / 2); i++) {
			b[i] = a[2 * i];
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] > 0) {
				saida += b[i] + " ";
			}
		}

		System.out.println(saida);
		System.exit(0);
	}
}