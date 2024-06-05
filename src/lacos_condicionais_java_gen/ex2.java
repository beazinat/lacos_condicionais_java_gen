package lacos_condicionais_java_gen;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número: ");
		num = leia.nextInt();
		
		leia.close();
		
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par.");
		} else {
			System.out.println("O número " + num + " é ímpar.");
		}
		
		if (num > 0) {
            System.out.println("O número " + num + " é positivo.");
        } else if (num < 0) {
            System.out.println("O número " + num + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

	}

}
