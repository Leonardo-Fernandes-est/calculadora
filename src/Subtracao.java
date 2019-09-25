import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {

		System.out.println("Operação de Subtração");
		System.out.println("Digite o valor 1");
		Scanner teclado = new Scanner(System.in);
		double valor1 = teclado.nextDouble();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Digite o valor 2");
		double valor2 = teclado.nextDouble();
		double resultado = valor1 - valor2;
		System.out.println("A multiplicação dos dois valores é " + resultado);
	}
}
