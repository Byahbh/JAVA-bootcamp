package exec_sec4;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		R= sc.nextDouble();
		
		A = pi * R * R;
		
		System.out.printf(" A=%.4f%n", A);
		
	
		sc.close();
	}

}
