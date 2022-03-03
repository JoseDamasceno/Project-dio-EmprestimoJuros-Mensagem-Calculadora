package dioCursoJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//CALCULADORA
		System.out.println("    CALCULADORA      ");
		System.out.print("Digitel primeiro numero: ");
		double x = sc.nextDouble();
		System.out.print("Digitel segundo numero: ");
		double y = sc.nextDouble();
		Calculadora.soma(x, y);
		Calculadora.subtrair(x, y);
		Calculadora.divisao(x, y);
		Calculadora.multiplicacao(x, y);
		
		//MENSAGEM
		
		System.out.println("   MENSAGEM     ");

		System.out.print("DIGITE UM HORARIO: ");
		int h = sc.nextInt();
		Mensagem.obterMensagem(h);
		
		//EMPRESTIMO
		
		System.out.println("   EMPRESTIMO     ");
		System.out.print("DIGITE O VALOR DO EMPRESTIMO: ");
		double valor = sc.nextDouble();
		int parcelas = sc.nextInt();
		SimularEmprestimo.calcularTaxa(valor, parcelas);
		
		
		
		
		sc.close();
	}

}
