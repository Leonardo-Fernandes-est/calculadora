package calculadora;

import java.util.Scanner;

public class calculadora {
	boolean tentarDnv;
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("(FLEX-CALC) Escolha a operação desejada:     ");
		System.out.println();
		System.out.println("1- Soma          2 - Divisão");
		System.out.println("3 - Subtração    4 - Multiplicação");

		System.out.println();

		
		
			int operador;
			operador = entrada.nextInt();
			//SOMAR
			if(operador == 1) { 
				System.out.println("Digite o primeiro numero: ");
				double numero1 = entrada.nextDouble();

				System.out.println("Digite o segundo numero: ");
				double numero2 = entrada.nextDouble();

				double resultado = numero1 + numero2;

				System.out.println("A soma é igual a: " + resultado);

			//DIVISÃO
			}if(operador == 2) {
				System.out.println("Digite o primeiro numero: ");
				double numero1 = entrada.nextInt();
				System.out.println("Digite o segundo numero: ");
				double numero2 = entrada.nextInt();
				double resultado = numero1 / numero2;

				System.out.println("A Divisão é igual a: " + resultado);

				if(numero2 == 0) {
					System.out.println(" A divisão por zero não é definida ");

			//SUBTRAÇÃO
			}}if(operador == 3) {
				System.out.println("Digite o primeiro numero: ");
				double numero1 = entrada.nextDouble();
				System.out.println("Digite o segundo numero: ");
				double numero2 = entrada.nextDouble();
				double resultado = numero1 - numero2;

					System.out.println("A multiplicação é igual a: " + resultado);
			//MULTIPLICAÇÃO
			}if(operador == 4) {
				System.out.println("Digite o primeiro numero: ");
				double numero1 = entrada.nextDouble();
				System.out.println("Digite o segundo numero: ");
				double numero2 = entrada.nextDouble();
				double resultado = numero1 * numero2;
					System.out.println("A multiplicação é igual a: " + resultado);
				}if(operador > 4){
					System.out.println("Digitou errado, tente novamente");
				}
			

		}}
	




					
			
				