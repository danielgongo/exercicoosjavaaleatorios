import java.util.Scanner;

/*Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
seu nome, o salário fixo e salário no final do mês.*/
public class VendedoComissao {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Nome do vendedor: ");
		String nome = scan.nextLine();
		
		System.out.println("Salário fixo do " + nome + " em R$: ");
		double salarioFixo = scan.nextDouble();
		
		System.out.println("Total de vendas efetuadas em R$: ");
		double totalVendas = scan.nextDouble();
		
		double comissaoVendas = (totalVendas * 15) / 100;
		double salFinal = salarioFixo + comissaoVendas;
		
		System.out.println("Nome do funcionário: " + nome);
		System.out.println("Salário fixo R$: : " + salarioFixo);
		System.out.println("Salário Final: " + salFinal);
		
		
		scan.close();

	}

}
