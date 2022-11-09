package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String opr;
		int n1, n2, sum, sub, mult;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Entre com a operacao a ser realizada: ");
		opr = read.next();
		System.out.print("Entre com o primeiro numero: ");
		n1 = read.nextInt();
		System.out.print("Entre com o segundo numero: ");
		n2 = read.nextInt();
		
		switch(opr) {
		case "+":
			sum = n1 + n2;
			System.out.println("O resultado da operacao eh: " + sum);
			break;
		case "-":
			sub = n1 - n2;
			System.out.println("O resultado da operacao eh: " + sub);
			break;
		case "*":
			mult = n1 * n2;
			System.out.println("O resultado da operacao eh: " + mult);
			break;
		default:
			System.out.println("Operacao invalida, escreva novamente.");
		}

	}

}
