package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, num, alt, maior = 0, num_maior = 0, menor = 0, num_menor = 0;
		
		for (cont = 1; cont <= 10; cont++) {
			System.out.println("Digite um n�mero:");
			num = sc.nextInt();
			System.out.println("Digite sua altura em cm:");
			alt = sc.nextInt();
			System.out.println();
			
			if (cont == 1) {
				maior = alt;
				num_maior = num;
				menor = alt;
				num_menor = num;
			} else {
				if (alt > maior) {
					maior = alt;
					num_maior = num;
	
				}
				if ( alt < menor) {
					menor = alt;
					num_menor = num;
				}
			}
			
		}
		System.out.println("Esse � o n�mero maior: " + num_maior);
		System.out.println("Esse � o aluno mais alto: " + maior);
		
		System.out.println("Esse � o n�mero menor: " + num_menor);
		System.out.println("Esse � o aluno mais baixo: " + menor);

	}

}
