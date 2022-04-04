package br.com.generation.aula03;

import java.util.Scanner;

public class ProgramaSequencial02 {

	public static void main(String[] args) {
		
		/*
		Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		int idadeAnos = 0;
		int idadeMeses = 0;
		int idadeDias = 0;
		int totalDias = 0;

		System.out.println("Digite a quantidade de Dias\n");
		totalDias = entrada.nextInt();
		
		
		idadeAnos = totalDias / 365;

		totalDias = totalDias % 365;

		idadeMeses = totalDias / 30;

		totalDias = totalDias % 30;

		idadeDias = totalDias;

		System.out.println("A idade é : " + idadeAnos + " anos");
		System.out.println("\nA quantidade de meses é: " + idadeMeses + " meses");
		System.out.println("\nA quantidade de dias é : " + idadeDias + " dias");

		entrada.close();
	}

}
