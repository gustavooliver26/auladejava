package exercicios;
import javax.swing.JOptionPane;

public class exercicio3 {

	public static void main(String[] args) {
		double soma, num1, num2 = 0;
		int n3 = 0;
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro numero: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro numero mermao"));
		soma = num1 + num2 + n3;
		JOptionPane.showMessageDialog(null, "A soma dos numeros é: " +soma );
	}

}
