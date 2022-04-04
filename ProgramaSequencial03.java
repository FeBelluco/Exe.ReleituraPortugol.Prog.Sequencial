package br.com.generation.aula03;

import java.util.Scanner;

public class ProgramaSequencial03 {

	public static void main(String[] args) {
		
		/*
	 	3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		int horas = 0, minutos = 0, segundos = 0, seg;
		 
    	System.out.println("Digite a duração do evento em segundos:");
    	segundos = entrada.nextInt();
    
    	horas = (segundos / 3600);
    	minutos = ((segundos % 3600) / 60);
    	seg = ((segundos % 3600) % 60);
    
   	System.out.println("A duração do evento foi de " + horas +" horas " + minutos + " minutos e " + seg + " segundos");
	
   	entrada.close();
	}

}
