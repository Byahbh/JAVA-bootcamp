package exec_sec4;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hora;
		double horatrab, salario;
		
		num = sc.nextInt();
		hora = sc.nextInt();
		horatrab = sc.nextDouble();
		
		salario = horatrab * hora;
		
		System.out.printf("O funcuionário nº%d tem o salário de U$%.2f", num, salario);
		
		sc.close();

	}

}
