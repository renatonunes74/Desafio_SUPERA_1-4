import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("\nN = ");
		int n = scanner.nextInt();
		System.out.printf("K = ");
		int k = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Informe os elementos do array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int count = contarParesComDiferencaK(arr, k);
		System.out.println("Existem " + count + " cuja diferença é igual o valor alvo " + k);

		scanner.close();
	}

	public static int contarParesComDiferencaK(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		int count = 0;
		for (int num : arr) {
			if (set.contains(num + k)) {
				count++;
			}
		}
		return count;
	}
}
