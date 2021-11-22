import java.util.Scanner;

public class TrocaValorVariavel {

	/*Escrever uma programa em que leia dois valores para as variáveis A e B, e
efetuar as trocas dos valores de forma que a variável A passe a possuir o valor
da variável B e a variável B passe a possuir o valor da variável A. Apresentar
os valores trocados.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Valor A: ");
		int valor1 = scan.nextInt();
		
		System.out.print("Valor B: ");
		int valor2 = scan.nextInt();
		
		int trocado = 0;
		
		switch (trocado) {
		case 1: System.out.println("O valor de A trocado pelo de B: " + valor2); break;
		case 2: System.out.println("O valor de B trocado pelo valor de A: " + valor1); break;
		}
		
		System.out.println("O valor de A trocado pelo  B: " + valor2);
		System.out.println("O valor de B trocado pelo  A: " + valor1);
		scan.close();

	}

}
