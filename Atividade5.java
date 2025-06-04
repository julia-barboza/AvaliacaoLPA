import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        String[] nomes = new String[8];
	        int[] idades = new int[8];

	        for (int i = 0; i < 8; i++) {
	            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
	            nomes[i] = ler.nextLine();

	            System.out.print("Digite a idade de " + nomes[i] + ": ");
	            idades[i] = Integer.parseInt(ler.nextLine()); // Não sei se poderia usar 
	        }

	        System.out.println("Pessoas maiores de idade:");
	        for (int i = 0; i < 8; i++) {
	            if (idades[i] >= 18) {
	                System.out.println(nomes[i] + " - " + idades[i] + " anos");
	            }
	        }

	        ler.close();

	}

}
