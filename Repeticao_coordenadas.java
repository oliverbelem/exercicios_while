package Exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Repeticao_coordenadas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Escreva as coordenadas X e Y...: ");
		int Eixox = sc.nextInt();
		int Eixoy = sc.nextInt();
		
		//Não faz tanto sentido semantico já que a condição exige que ambos sejam !=0 mas, somente um ja corta o laço de repetição
		
		while ( Eixox != 0 && Eixoy != 0) { 
			
			if (Eixox > 0 && Eixoy > 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if (Eixox > 0 && Eixoy < 0) {
				System.out.println("Segundo Quadrante");
			}
			else if (Eixox < 0 && Eixoy < 0) {
				System.out.println("Terceiro Quadrante");
			}
			else {
				System.out.println("Quarto Quadrante");
			}
			
				System.out.print("Escreva Novamente os pontos...: ");
				Eixox = sc.nextInt();
				Eixoy = sc.nextInt();

		}
		
		sc.close();
	}

}
