package usjt.br.algesd.aquecimento;

public class Exercicio16 {
	public static void main(String args[]) {
		int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };

		int n = a.length;
		int b[] = new int[1];
		int maior = a[0];

		String saida = "Resposta: ";

		for (int i = 0; i < n; i++) {
			if (a[i] > maior) {
				maior = a[i];
			}
		}

		b[0] = maior;

		saida = saida + maior;

		System.out.println(saida);
		System.exit(0);
	}
}