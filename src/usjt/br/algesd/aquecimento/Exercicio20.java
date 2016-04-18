package usjt.br.algesd.aquecimento;

public class Exercicio20 {
	public static void main(String args[]) {
		int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
		int n = a.length;
		int b[] = new int[n];
		int contador = 0;

		String saida = "Resposta: ";

		for (int i = 0; i < n; i++) {
			if (a[i] > 50) {
				b[contador] = i;
			}

			contador++;
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