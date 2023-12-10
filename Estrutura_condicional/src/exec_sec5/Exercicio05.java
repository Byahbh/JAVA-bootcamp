package exec_sec5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		//seguir, calcule e mostre o valor da conta a pagar.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int cod = sc.nextInt();
		int qtde = sc.nextInt();
		double total = 0;
		
		if (cod == 1) {
			total = qtde * 4.0;
		}
		else if (cod == 2) {
			total = qtde * 4.50;
		}
		else if (cod == 3) {
			total = qtde * 5.00;
		}
		else if (cod == 4) {
			total = qtde * 2.00;
		}
		else if (cod == 5) {
			total = qtde * 1.50;
		}
		
		
		System.out.printf("Total: R$%.2f%n", total);
		
		sc.close();

	}

}
