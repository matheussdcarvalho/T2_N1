package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Salários e cargos
		
	Scanner sc = new Scanner(System.in);
	double salario, aumento, novoSal, cargo;	
	
	System.out.println("Digite o cargo do funcionário: ");
		cargo = sc.nextDouble();
	
	System.out.println("Digite o valor do salário: ");
		salario = sc.nextDouble();
	
	if(cargo == 1){
		
			System.out.println("O cargo é: Escrituário");
		aumento = salario * 50/100;	
		System.out.println("O valor do aumento é: " + aumento);
		
		novoSal = salario + aumento;
		System.out.println("O novo salário é: " + novoSal);	
			
		}else if(cargo == 2){
			
			System.out.println("O cargo é: Secretário");
		aumento = salario * 35/100;	
		System.out.println("O valor do aumento é: " + aumento);
		
		novoSal = salario + aumento;
		System.out.println("O novo salário é: " + novoSal);
		
		}else if(cargo == 3){
			
			System.out.println("O cargo é: Caixa");
		aumento = salario * 20/100;	
		System.out.println("O valor do aumento é: " + aumento);
		
		novoSal = salario + aumento;
		System.out.println("O novo salário é: " + novoSal);
		
		}else if(cargo == 4){
			
			System.out.println("O cargo é: Gerente");
		aumento = salario * 10/100;	
		System.out.println("O valor do aumento é: " + aumento);
		
		novoSal = salario + aumento;
		System.out.println("O novo salário é: " + novoSal);	
		
		}else if(cargo == 5){
			
			System.out.println("O cargo é: Diretor");
		aumento = salario * 0/100;	
		System.out.println("O valor do aumento é: " + aumento);
		
		novoSal = salario + aumento;
		System.out.println("O novo salário é: " + novoSal);			
		}else {
			System.out.println("Cargo inexistente!");
		}
	
	}

}
