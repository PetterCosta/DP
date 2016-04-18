package usjt.br.algesd.aquecimento;

public class Exercicio19 {
	public static void main(String args[]) {
		int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
		int n = a.length;
		int b[] = new int[n];

		String saida = "Resposta: ";

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				b[i] = a[i];
			}
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