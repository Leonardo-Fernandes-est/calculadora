package calculadora;

import java.util.Scanner;

public class Soma {
	
		
		Scanner entrada = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double resultado;
		
		
		
		public void soma() {
		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("A soma é igual a: " + resultado);
		}


		public double getResultado() {
			return resultado;
		}


		public void setResultado(double resultado) {
			this.resultado = resultado;
		}


		public double getNumero1() {
			return numero1;
		}


		public void setNumero1(double numero1) {
			this.numero1 = numero1;
		}


		public double getNumero2() {
			return numero2;
		}


		public void setNumero2(double numero2) {
			this.numero2 = numero2;
		}
		
		
		
	}


