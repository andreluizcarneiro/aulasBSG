package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] ehPar = new int[5];
		for (int i=0; i<4; i++) {
			System.out.println("Insira o valor na posicao " + i);
			ehPar[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			if(ehPar[i] %2 == 0) {
				System.out.println("o numero digitado na posicao: " + i + ", com valor de: " + ehPar[i] + ", eh par ");
			}
		}

	}
}
