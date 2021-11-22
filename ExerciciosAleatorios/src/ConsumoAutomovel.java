import java.util.Scanner;


public class ConsumoAutomovel { 
	/*Escrever um programa para determinar o consumo m�dio de um autom�vel
sendo fornecida a dist�ncia total percorrida pelo autom�vel e o total de
combust�vel gasto.*/

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("Dist�ncia percorrida em KM: ");
		double distancia = scan.nextDouble();
		
		System.out.print("Total de combust�vel gasto em Litros: ");
		double gasGasto = scan.nextDouble();
		
		double mediaConsumo = distancia / gasGasto;
		
		System.out.println("M�dia de consumo de gasolina foi de: " + mediaConsumo + "Km/h");
		
		
		scan.close();
	}

}
