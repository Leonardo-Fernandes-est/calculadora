
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		System.out.println("Operação de multiplicação");
		System.out.println("Digite o valor 1");
		Scanner teclado = new Scanner(System.in);
		int valor1 = teclado.nextInt();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Digite o valor 2");
		int valor2 = teclado.nextInt();
		int resultado = valor1 * valor2;
		System.out.println("A multiplicação dos dois valores é " + resultado);
	}
}
