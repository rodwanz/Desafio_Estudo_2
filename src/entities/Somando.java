package entities;

import java.util.Scanner;

public class Somando {
	
	public static void entrada(String nome, int x[]) {
		Scanner ler = new Scanner(System.in);
		
		int i, n = x.length;
				
		for(i = 0; i < n; i++) {
			System.out.printf("%s[%d] = ", nome, i);
			x[i] = ler.nextInt();
		}
		System.out.println();
	}
	
	public static int soma(int x[]) {
		int i, n = x.length, soma = 0;
				
		for(i = 0; i <n; i++) {
			soma = soma + x[i];
		}
		return (soma);
	}
	
	public static void mostrar(String nome, int x[]) {
		int i, n = x.length;
				
		for(i = 0; i < n; i++) {
			System.out.printf("%s[%d] = %d\n", nome, i, x[i]);
		}
		System.out.println();
	}
}
