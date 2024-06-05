package lacos_condicionais_java_gen;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		int opcao, quantidade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Cachorro Quente");
		System.out.println("\n--Digite 2 para X-Salada");
		System.out.println("\n--Digite 3 para X-Bacon");
		System.out.println("\n--Digite 4 para Bauru");
		System.out.println("\n--Digite 5 para Refrigerante");
		System.out.println("\n--Digite 6 para Suco de laranja");
		
		opcao = leia.nextInt();
		
		System.out.println("\n--Digite a quantidade: ");
		
		quantidade = leia.nextInt();
		
		leia.close();
		
		switch (opcao) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.println("\nPreço: " + (quantidade * 10.00));
			break;
			
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.println("\nPreço: " + (quantidade * 15.00));
			break;
			
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.println("\nPreço: " + (quantidade * 18.00));
			break;
			
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("\nPreço: " + (quantidade * 12.00));
			break;
			
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("\nPreço: " + (quantidade * 8.00));
			break;
			
		case 6:
			System.out.println("Produto: Suco de laranja");
			System.out.println("\nPreço: " + (quantidade * 13.00));
			break;
			
		default:
			System.out.println("Opção inválida!");
		}

	}

}
