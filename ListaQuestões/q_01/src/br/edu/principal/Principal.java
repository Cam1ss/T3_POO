package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano_atual;
		double i, salario,nov_salario, percentual;
		System.out.println("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		salario = 1000;
		percentual = (1.5/100.0);
		nov_salario = salario + (percentual * salario);
		
		for (i = 0; i <= ano_atual - 1997; i++) {
			percentual = 2 * percentual;
			nov_salario = nov_salario + (percentual * nov_salario);
		} 
		System.out.println("Esse é o seu novo salário: " + nov_salario);

	}

}
