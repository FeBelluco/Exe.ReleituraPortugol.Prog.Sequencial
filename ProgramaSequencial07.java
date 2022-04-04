package br.com.generation.aula03;

import java.util.Scanner;

public class ProgramaSequencial07 {

	/*7.Escreva um algoritmo que lê os coeficientes a,b,c,d,e e f 
	e calcula e mostra os valores de x e y:
	*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		  
 		System.out.println("Digite o valor de a: ");
 		a = entrada.nextDouble();
 
 		System.out.println("Digite o valor de b: ");
 		b = entrada.nextDouble();

 		System.out.println("Digite o valor de c: ");
 		c = entrada.nextDouble();
 
 		System.out.println("Digite o valor de d: ");
 		d = entrada.nextDouble();
 
 		System.out.println("Digite o valor de e: ");
 		e = entrada.nextDouble();
 
 		System.out.println("Digite o valor de f: ");
 		f = entrada.nextDouble();
 
 		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
 
 		System.out.println("O valor de x é " + x + " e y é " + y);
 		
 		entrada.close();
	}

}
