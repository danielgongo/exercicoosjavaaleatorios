import java.util.Scanner;


public class ConsumoAutomovel { 
	/*Escrever um programa para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel e o total de
combustível gasto.*/

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("Distância percorrida em KM: ");
		double distancia = scan.nextDouble();
		
		System.out.print("Total de combustível gasto em Litros: ");
		double gasGasto = scan.nextDouble();
		
		double mediaConsumo = distancia / gasGasto;
		
		System.out.println("Média de consumo de gasolina foi de: " + mediaConsumo + "Km/h");
		
		
		scan.close();
	}

}
