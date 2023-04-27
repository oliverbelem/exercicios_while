package Exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Numero_clientes_abastecimento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int Alc = 0, Gas = 0, Diesel = 0;
		
		/* 1. Álcool
		 * 2. Gasolina
		 * 3. Diesel
		 * 4. Fim
		 * */
		System.out.print("Digite o código do combustível...: ");
		int ValorCod = sc.nextInt();
		
		while (ValorCod !=4 ) {
			if (ValorCod == 1) {
				Alc++;
			}
			else if (ValorCod == 2) {
				Gas++;
			}
			else if (ValorCod == 3) {
				Diesel++;
			}
			
			System.out.print("Digite um código Válido...: ");
			ValorCod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + Alc);
		System.out.println("Gasolina: " + Gas);
		System.out.println("Diesel: " + Diesel);
		
		sc.close();
		
	}

}
