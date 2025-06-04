import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int dia; // DECLRANDO VARIÁVEIS

		// ENTRADA DOS VALORES:
		System.out.print("Informe o número referente ao dia da semana: ");
		dia = ler.nextInt();

		// PROCESSAMENTO - SAÍDA
		switch (dia) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.print("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
		}
		ler.close();

	}
}