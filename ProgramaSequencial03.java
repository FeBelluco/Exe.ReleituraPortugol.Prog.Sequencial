package br.com.generation.aula03;

import java.util.Scanner;

public class ProgramaSequencial03 {

	public static void main(String[] args) {
		
		/*
	 	3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		int horas = 0, minutos = 0, segundos = 0, seg;
		 
    	System.out.println("Digite a dura��o do evento em segundos:");
    	segundos = entrada.nextInt();
    
    	horas = (segundos / 3600);
    	minutos = ((segundos % 3600) / 60);
    	seg = ((segundos % 3600) % 60);
    
   	System.out.println("A dura��o do evento foi de " + horas +" horas " + minutos + " minutos e " + seg + " segundos");
	
   	entrada.close();
	}

}
