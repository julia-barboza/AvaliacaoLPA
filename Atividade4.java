import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
 
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10, soma;
		
		System.out.println("Informe o número 1: ");
		numero1 = ler.nextDouble();
		System.out.println("Informe o número 2: ");
		numero2 = ler.nextDouble();
		System.out.println("Informe o número 3: ");
		numero3 = ler.nextDouble();
		System.out.println("Informe o número 4: ");
		numero4 = ler.nextDouble();
		System.out.println("Informe o número 5: ");
		numero5 = ler.nextDouble();
		System.out.println("Informe o número 6: ");
		numero6 = ler.nextDouble();
		System.out.println("Informe o número 7: ");
		numero7 = ler.nextDouble();
		System.out.println("Informe o número 8: ");
		numero8 = ler.nextDouble();
		System.out.println("Informe o número 9: ");
		numero9 = ler.nextDouble();
		System.out.println("Informe o número 10: ");
		numero10 = ler.nextDouble();

		// Não soube outra forma de fazer
		
		soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;
		System.out.println("A soma é: " + soma);

		ler.close();
	}

}
