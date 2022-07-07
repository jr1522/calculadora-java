package application;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao;
		int num1;
		int num2;

		do {
			System.out.printf("1 - Soma \n"
					+ "2 - Subtracao \n"
					+ "3 - Multiplicação \n"
					+ "4 - Divisao \n"
					+ "0 - Sair\n\n");
			opcao = sc.nextInt();
			
			if (opcao > 0 && opcao < 5) {

				System.out.println("Digite um número: ");
				num1 = sc.nextInt();
				System.out.println("Digite outro número: ");
				num2 = sc.nextInt();

				switch (opcao) {
				case 0:
					System.out.println("Saindo...");
					System.out.println();
					break;
				case 1:
					System.out.printf("Soma: \n" + (num1 + num2));
					System.out.println();
					break;
				case 2:
					System.out.printf("Subtração: \n" + (num1 - num2));
					System.out.println();
					break;
				case 3:
					System.out.printf("Multiplicação: \n" + (num1 * num2));
					System.out.println();
					break;
				case 4:
					while (num2 == 0) {
						System.out.println("Divisão por 0 não existe!\nDigite outro valor:\n");
						num2 = sc.nextInt();
						System.out.println();
					}
					System.out.printf("Divisão: \n" + (num1 / num2));
					System.out.println();
					break;
				default:
					System.out.println("Operação inválida \n ");

				}
			}
		} while (opcao != 0);

		sc.close();
	}
}
