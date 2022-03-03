package dioCursoJava;

public class Mensagem {
	
	public static void obterMensagem (int hora) {
		
		if (hora < 12) {
			System.out.println("BOM DIA " + hora +":00");
		}
		
		else if (hora >= 12 && hora < 18) {
			System.out.println("BOA TARDE "+ hora + ":00");
		}
		
		else if (hora >= 18 && hora < 23) {
			System.out.println("BOA NOITE " + hora +  ":00");
		}
		
		else {
			System.out.println("ERRO. NUMERO INVALIDO5");
		} 
			
	}

}
