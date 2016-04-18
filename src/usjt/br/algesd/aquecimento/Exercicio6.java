package usjt.br.algesd.aquecimento;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String args[]) {
		int x, y, z;
		Scanner ent = new Scanner(System.in);

		System.out.print("Digite os lados do Triangulo: \n");
		x = ent.nextInt();
		y = ent.nextInt();
		z = ent.nextInt();

		if ((x < y + z) && (y < x + z) && (z < x + y)) {
			if (x == y && x == z) {
				System.out.println("Triangulo Equilatero");
			} else if ((x == y) || (x == z)) {
				System.out.println("Triangulo Isosceles");
			} else
				System.out.println("Triângulo Escaleno");
		} else {
			System.out.println("Não é um triangulo!");
		}
	}
}