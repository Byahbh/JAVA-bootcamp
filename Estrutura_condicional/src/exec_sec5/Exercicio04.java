package exec_sec5;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int duracao;
		
		if (h1 < h2) {
			duracao = h1 - h2;
		}
		else {
			duracao =  24 - h1 + h2;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		
		sc.close();

	}

}
