package jogoDaVelha2;

import java.util.Scanner;

public class Program {
	public static char [][] tabuleiro = new char [3][3];
	
	public static boolean verificarHorizontais(char jogada) {
		// primeira linha
		if (tabuleiro[0][0] == jogada && tabuleiro[0][1] == jogada && tabuleiro[0][2] == jogada) {
			return true;
		}
		
		// segunda Linha
		if (tabuleiro[1][0] == jogada && tabuleiro[1][1] == jogada && tabuleiro[1][2] == jogada) {
			return true;
		}
		
		// terceira Linha
		if (tabuleiro[2][0] == jogada && tabuleiro[2][1] == jogada && tabuleiro[2][2] == jogada) {
			return true;
		}
		
		return false;
	}
	
	public static boolean verificarVerticais(char jogada) {
		// primeira coluna
		if (tabuleiro[0][0] == jogada && tabuleiro[1][0] == jogada && tabuleiro[2][0] == jogada) {
			return true;
		}
		
		// segunda coluna
		if (tabuleiro[0][1] == jogada && tabuleiro[1][1] == jogada && tabuleiro[2][1] == jogada) {
			return true;
		}
		
		// terceira coluna
		if (tabuleiro[0][2] == jogada && tabuleiro[1][2] == jogada && tabuleiro[2][2] == jogada) {
			return true;
		}
		
		return false;
	}
	
	public static boolean verificarDiagonais(char jogada) {
		// Diagonal esquerda
		if (tabuleiro[0][0] == jogada && tabuleiro[1][1] == jogada && tabuleiro[2][2] == jogada) {
			return true;
		}
		
		// Diagonal direita
		if (tabuleiro[0][2] == jogada && tabuleiro[1][1] == jogada && tabuleiro[2][0] == jogada) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char vezJogada = 'x';
		String tipoGanhou = "Ninguém ganhou!";

		while (true) {
			System.out.println("Agora é a vez de: " + vezJogada);
			//char jogada = sc.next().charAt(0); //'x'
			
			System.out.println("linha");
			int linha = sc.nextInt(); // 0
			
			System.out.println("coluna");
			int coluna = sc.nextInt(); // 2
			
			// Verificar se alguém já jogou na posição
			if (tabuleiro[linha][coluna] == 'x' || tabuleiro[linha][coluna] == 'o') {
				System.out.println("Posição já ocupada! Jogue novamente");
				continue;
			}
			
			// Marca no tabuleiro
			tabuleiro[linha][coluna] = vezJogada;
			
			// Mudar Jogada
			if (vezJogada == 'x') {
				vezJogada = 'o';
			} else {
				vezJogada = 'x';
			}
			
			// Desenha tabuleiro
			for (int l = 0; l < 3; l++) {
				for (int c = 0; c < 3; c++) {
					System.out.print("[ " + tabuleiro[l][c] + " ]");
				}
				
				System.out.println();
			}
			
			/* Verificar Horizontais */
			if (verificarHorizontais('x')) {
				tipoGanhou = "x ganhou na horizontal!";
				break;
			}
			
			if (verificarHorizontais('o')) {
				tipoGanhou = "o ganhou na horizontal!";
				break;
			}
			
			/* Verificar Verticais */
			if (verificarVerticais('x')) {
				tipoGanhou = "x ganhou na vertical!";
				break;
			}
			
			if (verificarVerticais('o')) {
				tipoGanhou = "o ganhou na vertical!";
				break;
			}
			
			/* Verificar Diagonais */
			if (verificarDiagonais('x')) {
				tipoGanhou = "x ganhou na diagonal!";
				break;
			}
			
			if (verificarDiagonais('o')) {
				tipoGanhou = "o ganhou na diagonal!";
				break;
			}
			
			// Verificar se deu velha
			int camposOcupados = 0;
			for (int l = 0; l < 3; l++) {
				for (int c = 0; c < 3; c++) {
					if (tabuleiro[l][c] == 'x' || tabuleiro[l][c] == 'o') {
						camposOcupados++;
					}
				}
			}
			
			if (camposOcupados == 9) {
				System.out.println("Deu velha!");
				break;
			}
		}
		
		System.out.println(tipoGanhou);
	}

}
