package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[4];
		for (int i=0; i<4; i++) {
			System.out.println("Insira o valor na posicao " + i);
			a[i] = sc.nextInt();
		}
		
		int[] b = new int[4];
		
		for(int i=0; i<4; i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}

	}
}
