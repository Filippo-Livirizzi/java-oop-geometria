package org.lessons.java.geometria;

//attributi interi: base e altezza.
//Aggiungere un opportuno costruttore con parametri.
//Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.

public class Rettangolo {

	int base;
	int altezza;

	//area rettangolo: b*h
	int Farea () {
		
		int area = base*altezza;
		return area;
		
	}
	//perimetro rettangolo: 2b+2h
	int Fperimetro() {
		int perimetro = 2 * base + 2 * altezza;
		return perimetro;
		
	}
}
