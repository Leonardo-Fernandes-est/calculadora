package calculadora;


import java.util.Scanner;

public class Divisão {

	Scanner entrada = new Scanner(System.in);
	
		
		double numero1;
		double numero2;
		double resultado;
		
		public void divisão() {
		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		resultado = numero1 / numero2;
		
		System.out.println("A Divisão é igual a: " + resultado);
		
		if(numero2 == 0) {
			System.out.println(" A divisão por zero não é definida ");
		}
	}
	}

