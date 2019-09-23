package calculadora;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("A soma é igual a: " + soma);
	}

}
