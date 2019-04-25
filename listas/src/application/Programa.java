package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de funcionarios: ");
		int n = sc.nextInt();

		List<Funcionario> lista = new ArrayList<>();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionario: 0" + (i+1));
			System.out.println("Digite o id do funcionario: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome do funcionario: ");
			String nome = sc.nextLine();
			System.out.println("Digite o salario do funcionario: ");
			double salario = sc.nextDouble();
			lista.add(new Funcionario(id, nome, salario));
		}

		System.out.println("-------------------------------------------");

		System.out.println("Digite o id do funcionario que receber� o acrescimo: ");
		int id = sc.nextInt();
		Funcionario f = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (f == null) {
			System.out.println("Funcion�rio n�o encontrado!");
		} else {
			f.incrementaSalario(f.getSalario());
		}
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Lista de funcion�rios: ");
		for(Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}
}
