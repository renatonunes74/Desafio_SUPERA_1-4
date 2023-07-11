import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor;

		// Leitura do valor de ponto flutuante
		while (true) {
			System.out.println("Entrada:");
			valor = scanner.nextDouble();
			if (valor > 0 && valor < 1000000.00) {
				break;
			} else {
				System.out.println("Digite apenas valores mairos que 0 e menores que 1000000.00");
			}
		}

		// Conversão do valor para centavos
		int centavos = (int) Math.round(valor * 100);

		// Cálculo das notas e moedas necessárias
		int[] notas = { 100, 50, 20, 10, 5, 2 };
		double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

		System.out.println("NOTAS:");
		for (int nota : notas) {
			int quantidadeNotas = centavos / (nota * 100);
			System.out.printf("%d nota(s) de R$ %.2f\n", quantidadeNotas, (double) nota);
			centavos %= (nota * 100);
		}

		System.out.println("MOEDAS:");
		for (double moeda : moedas) {
			int quantidadeMoedas = centavos / (int) (moeda * 100);
			System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, moeda);
			centavos %= (int) (moeda * 100);
		}

		scanner.close();
	}
}
