package desafio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
	public static void main (String[] args) {
		int entrada,num;
		boolean verifcarEntrada;
		Scanner scanner = new Scanner(System.in);

		List<Integer> impares = new ArrayList<>();
		List<Integer> pares = new ArrayList<>();

		// Verificação da primeira entrada
		do {
			System.out.println("Entrada");
			entrada = scanner.nextInt();
			if (entrada <= 1 || entrada > 100000) {
				System.out.println("Apenas maiores que 1 e menores que 100.000 mil");
			}
		} while (entrada <= 1 || entrada > 100000);

		// Armazenando as próximas entradas na List
		for (int i = 1; i <= entrada; i++) {
			num = scanner.nextInt();
			if (num < 0) {
				System.out.println("Apenas números inteiros e positivos");
				i--;
			} else if (num % 2 == 0) {
				pares.add(num);
			} else {
				impares.add(num);
			}
		}

		// Ordem decrescente do pares
		Collections.sort(impares, Comparator.reverseOrder());
		// Ordem crescente do pares
		Collections.sort(pares);

		System.out.println("Saída");

		for (int par : pares) {
			System.out.println(par);
		}
		for (int impar : impares) {
			System.out.println(impar);
		}
	}
}
