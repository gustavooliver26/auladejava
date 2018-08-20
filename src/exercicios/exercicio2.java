package exercicios;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double n1, n2, n3 = 0;
	System.out.println("Digite o primeiro numero");
	n1 = input.nextDouble();
	System.out.println("Digite o segundo numero");
	n2 = input.nextDouble();
	System.out.println("Digite o terceiro numero");
	n3 = input.nextDouble();
	double resultado = n1 + n2 + n3;
	System.out.println("O resultado é: " +resultado);

	}

}
