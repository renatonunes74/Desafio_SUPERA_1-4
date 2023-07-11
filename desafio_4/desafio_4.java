import java.util.Scanner;

public class DesembaralharString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // Número de casos de teste
		String linha;

		// Consumir a quebra de linha após o inteiro
		scanner.nextLine();

		for (int i = 0; i < N; i++) {
			while(true) {
				linha = scanner.nextLine();
				if (linha.length() >= 2 && linha.length() <= 100) {
					break;
				} else {
					System.out.println("A frase precisa ser maior que 2 e menor que 100 caracteres");
				}
			}
			String fraseOriginal = desembaralharString(linha);
			System.out.println(fraseOriginal);
		}

		scanner.close();
	}

	public static String desembaralharString(String linha) {
		int tamanho = linha.length();
		int meio = tamanho / 2;
		StringBuilder fraseOriginal = new StringBuilder(tamanho);

		// Construir a frase original a partir da linha impressa
		for (int i = meio - 1; i >= 0; i--) {
			fraseOriginal.append(linha.charAt(i));
		}

		for (int i = tamanho - 1; i >= meio; i--) {
			fraseOriginal.append(linha.charAt(i));
		}

		return fraseOriginal.toString();
	}
}

