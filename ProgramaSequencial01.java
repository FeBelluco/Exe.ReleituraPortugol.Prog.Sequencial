package br.com.generation.aula03;

import java.util.Scanner;

public class ProgramaSequencial01 {

	/*
	 Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int diasAno = 365, diasMes = 30, dias = 0, meses, anos;
		
		
				System.out.println("Informa sua Idade: \n");
				anos = entrada.nextInt();

				System.out.println("Meses: ");
				meses = entrada.nextInt();
				
				System.out.println("Dias: ");
				dias = entrada.nextInt();

				dias = (anos*diasAno) + (meses*diasMes) + dias;

				System.out.println("Sua idade em dias é:" + dias);

			entrada.close();
	}

}
