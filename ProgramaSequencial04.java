package br.com.generation.aula03;

import java.util.Scanner;

public class ProgramaSequencial04 {

	
		/*
		4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		calcule a seguinte express�o:
		r = (a+b) * (a+b)
		s = (b+c) * (b+c)
		d = (r + s)/2
		 */
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d, r, s;

		System.out.println("Digite o n�mero A: ");
		a = entrada.nextInt();

		System.out.println("Digite o n�mero B: ");
		b = entrada.nextInt();

		System.out.println("Digite o n�mero C: ");
		c = entrada.nextInt();

		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		
		d = (r+s) / 2;
		System.out.println("O valor de d �: " + d);
		
		entrada.close();
	}

}
