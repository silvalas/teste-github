package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Atributos;

public class Pgm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a qtde de quartos a serem alugados: ");

		int n = sc.nextInt();
		int aux;

		Atributos[] tabInt = new Atributos[10]; // --> "tabInt.length" ou "[10]" é a qtde de occurs do vetor (tab interna)

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			aux = i + 1;
			System.out.println();
			System.out.println("Aluguel #" + aux);
			System.out.print("Nome = ");
			String nome = sc.nextLine();
			System.out.print("Email = ");
			String email = sc.nextLine();
			System.out.print("Quarto = ");
			int quarto = sc.nextInt();

			tabInt[quarto] = new Atributos(nome, email, quarto);
		}

		System.out.println();
		System.out.println("Quartos alugados:");
		System.out.println();

		for (int i = 1; i < 10; i++) {

			if (tabInt[i] != null) {
				System.out.println(
						"Quarto " + tabInt[i].getQuarto() + ": " + tabInt[i].getNome() + ", " + tabInt[i].getEmail());
			}

		}

		sc.close();
	}
}

/*
 * 
 * package aplicacao;
 * 
 * import java.util.Scanner; import entidades.Atributos;
 * 
 * public class Pgm {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in); Atributos conta; // --> Instanciando
 * (declarando) a classe
 * 
 * System.out.print("Informe o número da conta = "); int numConta =
 * sc.nextInt();
 * 
 * System.out.print("Informe o titular da conta = "); sc.nextLine(); // -->
 * Declaração necessária para consumir quebra de linha String nomeTit =
 * sc.nextLine();
 * 
 * System.out.print("Deseja fazer depósito inicial (S/N)? "); char idDepIni =
 * sc.next().charAt(0);// --> Tipo de declaração que faz leitura de caracter
 * 
 * if (idDepIni == 's' || idDepIni == 'S') {
 * System.out.print("Informe o valor do depósito inicial = "); double depIni =
 * sc.nextDouble(); conta = new Atributos(numConta, nomeTit, depIni);// -->
 * Instanciando o construtor de 03 argumentos da classe (sobrecarga) } else {
 * conta = new Atributos(numConta, nomeTit); // --> Instanciando o construtor de
 * 02 argumentos da classe (sobrecarga) }
 * 
 * System.out.println(); System.out.println("Dados da conta:");
 * System.out.println(conta); // --> Retorna os dados da classe que está no
 * toString
 * 
 * System.out.println(); System.out.print("Informe o valor do depósito = ");
 * double valDep = sc.nextDouble(); conta.deposito(valDep); // --> Chama o
 * método depósito da classe, utilizando o valDep como parâmetro de entrada
 * System.out.println("Dados atualizados da conta:"); System.out.println();
 * System.out.println(conta); // --> Retorna os dados da classe que está no
 * toString
 * 
 * 
 * System.out.println(); System.out.print("Informe o valor do saque = "); double
 * valSaque = sc.nextDouble(); conta.saque(valSaque); // --> Chama o método
 * saque da classe, utilizando o valSaque como parâmetro de entrada
 * System.out.println("Dados atualizados da conta:"); System.out.println();
 * System.out.println(conta); // --> Retorna os dados da classe que está no
 * toString
 * 
 * 
 * 
 * 
 * Atributos dadosConta = new Atributos();
 * 
 * System.out.print("Informe o número da conta = "); dadosConta.numConta =
 * sc.nextInt();
 * 
 * System.out.print("Informe o titular da conta = "); sc.nextLine();
 * dadosConta.nomeTit = sc.nextLine();
 * 
 * System.out.print("Deseja fazer depósito inicial (S/N)? ");
 * 
 * dadosConta.idDepIni = sc.next().charAt(0);
 * 
 * if (dadosConta.idDepIni == 's' || dadosConta.idDepIni == 'S') {
 * System.out.print("Informe o valor do depósito inicial = "); dadosConta.valDep
 * = sc.nextDouble(); }
 * 
 * System.out.println(); System.out.println("Dados da conta:");
 * System.out.print(dadosConta.posConta()); System.out.println();
 * 
 * System.out.println(); System.out.print("Informe o valor do depósito = ");
 * dadosConta.valDep = sc.nextDouble();
 * 
 * System.out.println(); System.out.println("Dados atualizados da conta:");
 * System.out.println(dadosConta.posConta());
 * 
 * System.out.println(); System.out.print("Informe o valor do saque = ");
 * dadosConta.valSaque = sc.nextDouble();
 * 
 * System.out.println(); System.out.println("Dados atualizados da conta:");
 * System.out.println(dadosConta.posConta());
 * 
 * sc.close();
 * 
 * } }
 * 
 */