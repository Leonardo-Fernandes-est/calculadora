package calculadora;


import java.util.Scanner;

public class Divisão {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int divisão;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		divisão = numero1 / numero2;
		
		System.out.println("A Divisão é igual a: " + divisão);
	}
	}

