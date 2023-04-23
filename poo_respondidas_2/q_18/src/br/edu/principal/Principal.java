package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Verificar Triângulo T2 Q18 R
	
	Scanner sc = new Scanner(System.in);	
	double x,y,z;
	
	System.out.println("Digite o valor de X: ");
	x = sc.nextDouble();
	
	System.out.println("Digite o valor de Y: ");
	y = sc.nextDouble();
	
	System.out.println("Digite o valor de Z: ");
	z = sc.nextDouble();
	
	if((x < y + z) && (y < x + z) && (z < x + y))  {	
		if((x == y) && (y == z)){
			System.out.println("Este triangulo é Equilatero.");
		} else if((x == y) || (x == z) || (y == z)){		
			System.out.println("Este triangulo é Isóceles.");
			
		}else if((x != y) && (x != z) && (y != z)){
			System.out.println("Este triangulo é Escaleno.");		
		
			}
		}else {
			System.out.println("Este triângulo não existe!");
			
			} 
	
	}

}
