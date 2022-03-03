package dioCursoJava;

public class Calculadora {
	
	public static void soma (double numero1,double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("SOMA: " + numero1 + " + " + numero2 + " = " + resultado);
	} 
	
	public static void subtrair (double numero1,double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("SUBITRAÇÃO: " + numero1 + " - " + numero2 + " = " + resultado);
		}
	
	public static void divisao (double numero1,double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("DIVISÃO: " + numero1 + " por " + numero2 + " = " + resultado);
		}
	
	public static void multiplicacao (double numero1,double numero2) {
		double resultado = numero1 * numero2;
		System.out.println("MULTIPLICAÇÃO: " + numero1 + " x " + numero2 + " = " + resultado);
		}

}
