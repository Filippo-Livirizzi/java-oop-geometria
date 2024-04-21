package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rettangolo misura = new Rettangolo();
		
		System.out.println("Inserisci la base: ");
		misura.base = input.nextInt();
		
		System.out.println("Inserisci l'altezza: ");
		misura.altezza = input.nextInt();
		
		System.out.println("L'area del rettangolo misura: ");
		System.out.println(misura.Farea());
		
		System.out.println("Il perimetro del rettangolo misura: ");
		System.out.println(misura.Fperimetro());


	}

}
