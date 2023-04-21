package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// menu opções
	
	Scanner sc = new Scanner(System.in);
	double op, sal, imp, aum, novoSal;	
	
	System.out.println("Qual operação você deseja fazer?");
		op = sc.nextDouble();
	if(op == 1) {
		System.out.println("Digite o valor do seu salário: ");
			sal = sc.nextDouble();
			
			if(sal < 500) {
				imp = sal * 5/100;
			System.out.println("O valor dos impostos é: " + imp);
				
			}if((sal >= 500) && (sal <= 850)) {
				imp = sal * 10/100;	
			System.out.println("O valor dos impostos é: " + imp);
			
			}if(sal > 850) {
				imp = sal * 15/100;
			System.out.println("O valor dos impostos é: " + imp);
			}
	} 
	
	if(op == 2) {
		System.out.println("Digite o valor do seu salário: ");
		sal = sc.nextDouble();
		
		if(sal > 1500) {
			aum = 25;
			novoSal = sal + aum;
			System.out.println("Seu novo salário é: " + novoSal);
		}
		if((sal >= 750) && (sal <= 1500)) {

				aum = 50;
				novoSal = sal + aum;
				System.out.println("Seu novo salário é: " + novoSal);
		}
		if((sal >= 450) && (sal < 750)) {

				aum = 75;
				novoSal = sal + aum;
				System.out.println("Seu novo salário é: " + novoSal);	
		} 	
		if(sal < 450) {
			aum = 100;
			novoSal = sal + aum;
			System.out.println("Seu novo salário é: " + novoSal);	
	
		}
		
	}
	if(op == 3) {
		System.out.println("Digite o valor do seu salário: ");
		sal = sc.nextDouble();
		
		if(sal <= 700) {
			System.out.println("Mal remunerado");
		}
		if(sal > 700) {
			System.out.println("Bem remunerado");
		}
	}
	if ((op < 1) || (op > 3)) {
		System.out.println("Opção inválida!");
	}
			
	}

}
