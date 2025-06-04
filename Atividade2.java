import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double base, altura, area; // DECLARANDO VÁRIAVEIS

		// ENTRADA DOS VALORES:
		System.out.println("Informe o valor da base do objeto: ");
		base = ler.nextDouble();

		System.out.println("Informe o valor da altura do objeto: ");
		altura = ler.nextDouble();

		// PROCESSAMENTO:
		area = base * altura / 2;

		// SAÍDA:
		System.out.println("A área do objeto é: " + area);
		ler.close();
	}

}
