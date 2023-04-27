package Exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Validador_senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite a senha do sistema...:");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta...");
			System.out.println("------------------");
			
			System.out.print("Tente Novamente...:");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido...");
		
		
		sc.close();
		
	}

}
