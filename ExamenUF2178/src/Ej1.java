import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 *
 */
public class Ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double peso, altura, imc;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el peso (en Kg): ");
		peso = entrada.nextDouble();
		
		System.out.println("Introduce la altura (en metros): ");
		altura = entrada.nextDouble();
		
		imc= peso/Math.pow(altura, 2);
		
		String diagnostico;
		if (imc < 18.5) {
			diagnostico = "Bajo peso";
		} else if (imc>=18.5 && imc <=24.9) {
			diagnostico= "Peso normal (saludable)";
		} else if (imc>=25 && imc <=29.9) {
			diagnostico= "Sobrepeso";
		} else if (imc>=30 && imc <=40) {
			diagnostico= "Obesidad premórbida";
		} else {
			diagnostico="Obesidad órbida";
		}
		
		System.out.printf("El paciente de %.2f Kg y %.2f metros de altura tiene "
				+ "un IMC de %.2f y un diagnostico de %s", peso,altura,imc,diagnostico);

	}

}
