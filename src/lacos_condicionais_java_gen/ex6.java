package lacos_condicionais_java_gen;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex6 {

	public static void main(String[] args) {
		int codigoCargo;
		float salario;
		String nomeColaborador = "Nome do Colaborador";
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Nome completo: ");
		nomeColaborador = leia.nextLine();
		
		System.out.println("-------Digite o código do cargo:");
		System.out.println("==========   Cargos   ==========");
		System.out.println("\n1---Gerente");
		System.out.println("\n2---Vendedor");
		System.out.println("\n3---Supervisor");
		System.out.println("\n4---Motorista");
		System.out.println("\n5---Estoquista");
		System.out.println("\n6---Técnico de TI");
		codigoCargo = leia.nextInt();
		
		System.out.println("Salário atual: ");
		salario = leia.nextFloat();
		
		leia.close();
		
		switch (codigoCargo) {
		case 1:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("\nCargo: Gerente");
			System.out.println("\nSalário: " + df.format(salario + (salario * 1.10)));
			break;
			
		case 2:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("\nCargo: Vendedor");
			System.out.println("\nSalário: " + df.format(salario + (salario * 0.7)));
			break;
			
		case 3:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("\nCargo: Supervisor");
			System.out.println("\nSalário: " + df.format(salario + (salario * 0.9)));
			break;
			
		case 4:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("\nCargo: Motorista");
			System.out.println("\nSalário: " + df.format(salario + (salario * 0.6)));
			break;
			
		case 5:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("\nCargo: Estoquista");
			System.out.println("\nSalário: " + df.format(salario + (salario * 0.5)));
			break;
			
		case 6:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("\nCargo: Técnico de TI");
			System.out.println("\nSalário: " + df.format(salario + (salario * 0.8)));
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
	}
}
