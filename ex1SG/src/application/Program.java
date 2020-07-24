package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Forma 1
		System.out.println("Inserir tamanho desejado");
		int n = sc.nextInt();
		double media = 0;
	
		double soma = 0;
		
		for(int i=0; i<n; i++) {
			
			System.out.println(i);
				soma += i;
				
		}
		
		media = soma/n;
		System.out.println("a soma sera: " + soma);
		System.out.println("a media sera: " + media);

		//Forma 2
		System.out.println("-----------------");
		double[] m = new double[5];
		double soma2 = 0;
		double media2 = 0;
		System.out.println("Insira 5 numeros desejados: ");
		for (int i=0; i<5; i++) {
			m[i] = sc.nextInt();
			soma2 += m[i];
		}
		media2 += soma2/5;
		System.out.println("a media 2 sera: " + media2);
		
		
		
		sc.close();
		}
	}