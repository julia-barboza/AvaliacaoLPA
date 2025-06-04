import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, resul; // DECLRANDO VARIÁVEIS

		// ENTRADA DOS VALORES:
		System.out.println("Informe o primiro número: ");
		num1 = ler.nextInt();

		System.out.println("Informe o segundo número: ");
		num2 = ler.nextInt();

		resul = num1 + num2; // SOMA DOS VALORES - PROCESSAMENTO

		// SAÍDA
		System.out.println("O resultado da operação é: " + resul);

		ler.close();
	}

}
