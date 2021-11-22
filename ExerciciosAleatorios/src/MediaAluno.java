import java.util.Scanner;

/*Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a
sua média (aritmética).*/
public class MediaAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String nomeAluno = "";
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		System.out.print("Nome do aluno: ");
		nomeAluno = scan.nextLine();
		
		System.out.println("Primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.println("Terceira nota: ");
		nota3 = scan.nextDouble();
		
		double mediaFinal = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Nome do aluno: " + nomeAluno);
		System.out.println("Média final: " + mediaFinal);
		
		scan.close();
		
	}

}
