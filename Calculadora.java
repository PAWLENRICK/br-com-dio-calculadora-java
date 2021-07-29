package br.com.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um inteiro: ");
		int a = scan.nextInt();
		System.out.println("Digite um outro inteiro: ");
		int b = scan.nextInt();
		
		System.out.println("A soma �         : " + soma(a, b));
		System.out.println("A subtra��o �    : " + sub(a, b));
		System.out.println("A multiplica��o �: " + mult(a, b));
		System.out.println("A divis�o �      : " + div(a, b));
	}
	
	static int soma(int a, int b) {
		return a + b;
	}
	
	static int sub(int a, int b) {
		return a - b;
	}
	
	static int mult(int a, int b) {
		return a * b;
	}
	
	static int div(int a, int b) {
		return a / b;
	}

}