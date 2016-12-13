/**Programa del Ejercicio 1
 * @author LuisMario
 * @version 1.0 */
public class Ejercicio1 {
	double valorMedio = calcularValorMedio(valorMenor, valorMayor);// metodo
	//variables
	int valorMayor = 10;
	int valorMenor = 1;
	public static void main (String[] args) {
	
		for(int i = 10; int i >= 1; int i--)
		System.out.println("Los numeros entre 10 y 1 son: " + i);
	}
	
	public static double calcularValorMedio(int valorMenor, int valorMayor){ //llamada al metodo
		
		return valorMedio = ((valorMenor + valorMayor) / 2);
		System.out.printf("El valor medio entre %d y %d es %2f%n" + valorMayor, valorMenor, valorMedio);
	}
}

