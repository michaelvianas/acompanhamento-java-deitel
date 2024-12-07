/*
 * Resolução do exercício 6.8 do livro Java Deitel 10ª edição
 * 
 * (Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até duas horas.
 * Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. A tarifa má-
 * xima para qualquer dado período de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24
 * horas por vez. Escreva um aplicativo que calcule e exiba as tarifas de estacionamento para cada cliente que esta-
 * cionou nessa garagem ontem. Você deve inserir as horas de estacionamento para cada cliente. O programa deve exibir
 * a cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve utilizar o método
 * calculatesCharges para determinar a tarefa para cada cliente. 
 * */

import java.util.Scanner;

public class TaxaEstacionamento {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do primeiro cliente: ");
		String cliente1 = leia.nextLine();
		leia.nextLine();
		System.out.print("Qual a quantidade de horas que o cliente " + cliente1 + " usou o estacionamento: ");
		int horasCliente1 = leia.nextInt();
		System.out.printf("%s terá que pagar R$ %.2f", cliente1, calculateCharges(horasCliente1));
		
		System.out.println();
		System.out.print("Digite o nome do segundo cliente: ");
		String cliente2 = leia.nextLine();
		leia.nextLine();
		System.out.print("Qual a quantidade de horas que o cliente " + cliente2 + " usou o estacionamento: ");
		int horasCliente2 = leia.nextInt();
		System.out.printf("%s terá que pagar R$ %.2f", cliente2, calculateCharges(horasCliente2));
	}
	
	public static double calculateCharges(int horas) {
		if(horas > 0 && horas <= 3) {
			return 2.00;
		}else if(horas <= 19) {
			return 2.00 + (horas-3)*0.5;
		}else {
			return 10.00;
		}
	}
}
