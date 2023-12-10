package exec_sec5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09_notafinal_extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		
		System.out.println("Digite a primeira nota:");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota nota:");
		nota2 = sc.nextDouble();
		
		notaFinal= nota1 + nota2;
		
		if(notaFinal > 60.0) {
			System.out.printf("NOTA FINAL: %.1f%n PARABÉNS! Aprovado!", notaFinal);
		}
		else {
			System.out.printf("NOTA FINAL: %.1f%n REPROVADO!", notaFinal);
		}
		
		sc.close();

	}

}
