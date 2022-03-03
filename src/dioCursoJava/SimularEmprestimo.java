package dioCursoJava;

public class SimularEmprestimo {
	
	public static double getTaxaUmaPacela() {
		 return 0.2;
	}
	
	public static double getTaxaDuasPacelas() {
		 return 0.3;
	}
	public static double getTaxaTresPacelas() {
		 return 0.45;
	}
	
	public static void calcularTaxa(double valor,int parcelas) {
		
		if (parcelas == 2) {
			double valorFinal = valor +(valor * getTaxaDuasPacelas());
			System.out.printf("VALOR FINAL DO EMPRESTIMO EM 2x R$  %.2f  " , valorFinal);
		}
		
		else if (parcelas == 3 ) {
			double valorFinal = valor + (valor * getTaxaTresPacelas());
			
			System.out.printf("VALOR FINAL DO EMPRESTIMO EM 3x R$ %.2f  " , valorFinal);
		}
		
		else if (parcelas == 1) {
			double valorFinal = valor +(valor * getTaxaDuasPacelas());
			System.out.printf("VALOR FINAL DO EMPRESTIMO R$ %.2f " , valorFinal);
		}
		else {
			System.out.println(" NUMERO DE PARCELAS ACIMA DO PERMITIDO  ");
		}
	}
	
	
}
