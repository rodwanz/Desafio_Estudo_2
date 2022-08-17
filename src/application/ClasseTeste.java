package application;

import entities.Somando;

public class ClasseTeste {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		
		Somando.entrada("a", a);
		Somando.mostrar("a", a);
		
		System.out.printf("Soma = %d\n", Somando.soma(a));
	}
}
