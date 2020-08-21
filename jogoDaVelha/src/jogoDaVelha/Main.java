package jogoDaVelha;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char [][] tabuleiro = new char [3][3];
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
			
			/* VERIFICAR LINHAS HORIZONTAIS */
			// primeira linha
			if (tabuleiro[0][0] == 'x' && tabuleiro[0][1] == 'x' && tabuleiro[0][2] == 'x') {
				tipoGanhou = "Primeira linha x ganhou!";
				break;
			}
			
			// segunda Linha
			if (tabuleiro[1][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[1][2] == 'x') {
				tipoGanhou = "Segunda linha x ganhou!";
				break;
			}
			
			// terceira Linha
			if (tabuleiro[2][0] == 'x' && tabuleiro[2][1] == 'x' && tabuleiro[2][2] == 'x') {
				tipoGanhou = "Terceira linha x ganhou!";
				break;
			}
			
			// primeira linha
			if (tabuleiro[0][0] == 'o' && tabuleiro[0][1] == 'o' && tabuleiro[0][2] == 'o') {
				tipoGanhou = "Primeira linha x ganhou!";
				break;
			}
			
			// segunda Linha
			if (tabuleiro[1][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[1][2] == 'o') {
				tipoGanhou = "Segunda linha o ganhou!";
				break;
			}
			
			// terceira Linha
			if (tabuleiro[2][0] == 'o' && tabuleiro[2][1] == 'o' && tabuleiro[2][2] == 'o') {
				tipoGanhou = "Terceira linha o ganhou!";
				break;
			}

			/* VERIFICAR LINHAS VERTICAIS */
			// primeira coluna
			if (tabuleiro[0][0] == 'x' && tabuleiro[1][0] == 'x' && tabuleiro[2][0] == 'x') {
				tipoGanhou = "Primeira coluna x ganhou!";
				break;
			}
			
			// segunda coluna
			if (tabuleiro[0][1] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][1] == 'x') {
				tipoGanhou = "Segunda coluna x ganhou!";
				break;
			}
			
			// terceira coluna
			if (tabuleiro[0][2] == 'x' && tabuleiro[1][2] == 'x' && tabuleiro[2][2] == 'x') {
				tipoGanhou = "Terceira coluna x ganhou!";
				break;
			}
			
			// primeira coluna
			if (tabuleiro[0][0] == 'o' && tabuleiro[1][0] == 'o' && tabuleiro[2][0] == 'o') {
				tipoGanhou = "Primeira coluna o ganhou!";
				break;
			}
			
			// segunda coluna
			if (tabuleiro[0][1] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][1] == 'o') {
				tipoGanhou = "Segunda coluna o ganhou!";
				break;
			}
			
			// terceira coluna
			if (tabuleiro[0][2] == 'o' && tabuleiro[1][2] == 'o' && tabuleiro[2][2] == 'o') {
				tipoGanhou = "Terceira coluna o ganhou!";
				break;
			}
			
			/* VERIFICAR LINHAS DIAGONAIS */
			// Diagonal esquerda
			if (tabuleiro[0][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][2] == 'x') {
				tipoGanhou = "Diagonal esquerda x ganhou!";
				break;
			}
			
			// Diagonal direita
			if (tabuleiro[0][2] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][0] == 'x') {
				tipoGanhou = "Diagonal direita x ganhou!";
				break;
			}
			
			// Diagonal esquerda
			if (tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][2] == 'o') {
				tipoGanhou = "Diagonal esquerda o ganhou!";
				break;
			}
			
			// Diagonal direita
			if (tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][0] == 'o') {
				tipoGanhou = "Diagonal direita o ganhou!";
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
