package br.com.generation.aula03;

import java.util.Scanner;

public class ProgramaSequencial05 {

	public static void main(String[] args) {
		
		/*
		5. Faça um sistema que leia as 3 notas de um aluno e 		calcule a média final deste
		aluno. Considerar que a média é ponderada e que 		o peso das notas é: 2,3 e 5,
		respectivamente.
		*/

		Scanner entrada = new Scanner(System.in);
		
		double n1 = 0.0, n2= 0.0, n3 = 0.0, p1= 0.0, p2= 0.0, p3= 0.0, media;

	   	System.out.println("Programa: Média ponderada. \n\n");
	   	System.out.println();
	   	System.out.println("Insira o valor da primeira nota: ");
		n1 = entrada.nextDouble();

	   	System.out.println("Insira o peso da primeira nota: ");
	   	p1 = entrada.nextDouble();

	  	System.out.println("Insira o valor da segunda nota: ");
	   	n2 = entrada.nextDouble();

	   	System.out.println("Insira o peso da segunda nota: ");
	   	p2 = entrada.nextDouble();
	   	
	   	System.out.println("Insira o valor da terceira nota: ");
	   	n3 = entrada.nextDouble();

	   	System.out.println("Insira o peso da terceira nota: ");
	   	p3 = entrada.nextDouble();

	   	media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
	   	System.out.println("A média é: \n" + media);
		
		entrada.close();
	}

}
