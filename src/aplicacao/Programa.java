package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Funcionario;

public class Programa {
	
	static List <Cliente> listaCli = new ArrayList<>();
	static List <Funcionario> listaFunc = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op;
				
		do {
			System.out.println("*** MENU ***");
			System.out.println("1 - Cadastro de Cliente");
			System.out.println("2 - Cadastro de Funcionario");
			System.out.println("3 - Listar Cliente");
			System.out.println("4 - Listar Funcionario");
			System.out.println("5 - Fim");
			System.out.println("Qual a sua opção: ");
			op = sc.nextInt();
			switch (op) {
			case 1: cadastroCliente();
			break;
			case 2: cadastroFuncionario();
			break;
			case 3: listaCliente();
			break;
			case 4: listaFuncionario();
			break;
			default : System.out.println("Opção inválida");
			}
		} while (op != 5);
	}	
	
	public static void cadastroCliente() {
		Scanner sc = new Scanner(System.in);
		int id, continuar;
		String nome;
		String cpf;
		String telefone;
		System.out.println("*** Cadatro de Clientes ***");
		do {
			System.out.println("Informe o ID do cliente: ");
			id = sc.nextInt();
			System.out.println("Informe o nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Informe o CPF: ");
			cpf = sc.nextLine();
			System.out.println("Informe o telefone: ");
			telefone = sc.nextLine();
			listaCli.add( new Cliente(id,nome,cpf,telefone));
			System.out.println("Continuar (1)sim (2)não: ");
			continuar = sc.nextInt();
		} while(continuar == 1);
	}	
	
	public static void cadastroFuncionario() {
		Scanner sc = new Scanner(System.in);
		int id, continuar;
		String nome;
		String cpf;
		String telefone;
		System.out.println("*** Cadatro de Funcionario ***");
		do {
			System.out.println("Informe o ID do Funcionario: ");
			id = sc.nextInt();
			System.out.println("Informe o nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Informe o CPF: ");
			cpf = sc.nextLine();
			System.out.println("Informe o telefone: ");
			telefone = sc.nextLine();
			listaFunc.add(new Funcionario(id,nome,cpf,telefone));
			System.out.println("Continuar (1)sim (2)não: ");
			continuar = sc.nextInt();
		} while(continuar == 1);
	}
	
	public static void listaCliente() {
		System.out.println("Listagem de Clientes");
		for (Cliente cli : listaCli) {
			System.out.println(cli.toString());
		}
	}
	
	public static void listaFuncionario() {
		System.out.println("Listagem de Funcionarios");
		for (Funcionario func : listaFunc) {
			System.out.println(func.toString());
		}
	}
}
