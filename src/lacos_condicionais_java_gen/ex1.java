package lacos_condicionais_java_gen;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a, b, c, somaAB;

		System.out.printf("Digite o número A: ");
		a = leia.nextInt();

		System.out.printf("Digite o número B: ");
		b = leia.nextInt();

		System.out.printf("Digite o número C: ");
		c = leia.nextInt();

		leia.close();

		somaAB = a + b;

		if (somaAB >= c) {
			System.out.println("A soma de A + B é maior do que C");
		} else if (somaAB == c) {
			System.out.println("A soma de A + B é igual a C");
		} else {
			System.out.println("A soma de A + B é menor do que C");
		}
	}
}
