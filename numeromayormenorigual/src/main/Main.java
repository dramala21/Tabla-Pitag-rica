package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Introduce el primer número");
		int numero1 = sc.nextInt();
		System.out.println ("Introduce el segundo número");
		int numero2 = sc.nextInt();
		System.out.println ("Introduce el tercer número");
		int numero3 = sc.nextInt();
		
		int numeroMayor = 0;
		
		// MAYOR
		if(numero1 >= numero2 && numero1 >= numero3) {
			numeroMayor = numero1;
		}
			
		if(numero2 >= numero3 && numero2 >= numero1) {
			numeroMayor = numero2;
		}
			
		if(numero3 >= numero2 && numero3 >= numero1) {
			numeroMayor = numero3;
		}
		
		int numeroMenor = 0;
		
		if(numero1 <= numero2 && numero1 <= numero3) {
			numeroMenor = numero1;
		}
		if(numero2 <= numero1 && numero2 <= numero3) {
			numeroMenor = numero2;
		}	
		if(numero3 <= numero1 && numero3 <= numero2) {
			numeroMenor = numero3;
		}
		
		int numeroIgual = 0;
		
		if(numero1 == numero2) {
			numeroIgual = numero1;
		}
		if(numero1 == numero3) {
			numeroIgual = numero2;
		}	
		if(numero2 == numero3) {
			numeroIgual = numero3;		
		}
			
		System.out.println ("El numero mayor es: " + numeroMayor);
		System.out.println ("El numero menor es: " + numeroMenor);
		System.out.println ("Numero igual detectado es: " + numeroIgual);
		
		
	}
 
}
