import java.util.Scanner;

/*Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e o
total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o
seu nome, o sal�rio fixo e sal�rio no final do m�s.*/
public class VendedoComissao {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Nome do vendedor: ");
		String nome = scan.nextLine();
		
		System.out.println("Sal�rio fixo do " + nome + " em R$: ");
		double salarioFixo = scan.nextDouble();
		
		System.out.println("Total de vendas efetuadas em R$: ");
		double totalVendas = scan.nextDouble();
		
		double comissaoVendas = (totalVendas * 15) / 100;
		double salFinal = salarioFixo + comissaoVendas;
		
		System.out.println("Nome do funcion�rio: " + nome);
		System.out.println("Sal�rio fixo R$: : " + salarioFixo);
		System.out.println("Sal�rio Final: " + salFinal);
		
		
		scan.close();

	}

}
