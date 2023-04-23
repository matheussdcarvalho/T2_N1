package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Preço, novo preço, classificação
		
		double preco, novoPreco;
		String clas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		preco = sc.nextDouble();
		
		if(preco <= 50) {
			novoPreco = preco + (preco * 5/100);
		System.out.println("O novo preço do produto é: " + "R$" + novoPreco);
		}
		if((preco > 50) && (preco <= 100)) {
			novoPreco = preco + (preco * 10/100);
		System.out.println("O novo preço do produto é: " + "R$" + novoPreco);
		}
		if(preco > 100) {
			novoPreco = preco + (preco * 15/100);
		System.out.println("O novo preço do produto é: " + "R$" + novoPreco);
		}


	}

}
