package exercicios;//indicando que est� no pacote exercicios
import java.util.Scanner; //importando o Scanner

public class exercicio1 { //criando a classe exercicio1

	public static void main(String[] args) { // m�todo principal - classe publica, estatica e sem retorno
		Scanner input = new Scanner(System.in); // instanciando o scanner (pra 'ler' os valores)
		int n1 = 0 , n2 = 0, result = 0; 
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o pr�ximo n�mero: ");
		n2 = input.nextInt();
		result = n1 + n2;
		System.out.printf("O resultado da soma �: " +result);
	}

}
