package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Verificar número menor

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o valor do segundo número: ");
		double n2 = sc.nextDouble();
		
		if(n1 < n2) {
			double menor = n1;
			System.out.println("O menor número é: " + menor);
			
		}else if (n2 < n1) {
			double menor = n2;
			System.out.println("O menor número é: " + menor);
		
		}else {
			System.out.println("Os números são iguais!");
		}
	}

}
