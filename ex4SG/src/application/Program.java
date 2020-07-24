package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[] teste = {12,32,54};
		
		for(int i=0; i<3; i++) {
			System.out.println(teste[i]);
		}
		
		System.out.println("-----------------");
		int[] teste2 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("Insira o valor na posicao: " + i + ": ");
			teste2[i] = sc.nextInt();
		}

		int[] teste3 = new int[3];
		for(int i=0; i<3; i++) {
			
			teste3[i] = teste2[i];
			System.out.println(teste3[i] + 10);
		}
		
	}
}
