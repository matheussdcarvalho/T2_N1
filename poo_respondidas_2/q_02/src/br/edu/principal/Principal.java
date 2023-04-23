package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Notas, média aritmética
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, notaExame;
		
		System.out.println("Digite a PRIMEIRA nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a SEGUNDA nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a TERCEIRA nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Sua média foi: " + media);
		
		if((media >= 0) && (media < 3)) {
			System.out.println("Reprovado!");
		}
		if((media >= 3) && (media < 7)) {
			System.out.println("Fará exame!");
			notaExame = 12 - media;
			System.out.println("Você tirar " + notaExame + " para ser aprovado.");
		}
		if((media >= 7) && (media <= 10)) {
			System.out.println("Aprovado!");
		}
		
	}

}
