import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 *
 */
public class Ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double imcs_pacientes [][] = {
			    {15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},
			    {38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},
			    {33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},
			    {32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}
			};
		
		System.out.println("LA matriz de imcs es:");
		examen.mostrar_imcs(imcs_pacientes);
		Scanner entrada = new Scanner(System.in);
		
		int numPaciente;
		do {
			System.out.printf("¿Que paciente quieres calcular (0-%d):", imcs_pacientes.length-1);
			numPaciente = entrada.nextInt();
		} while(numPaciente<0 || numPaciente >=imcs_pacientes.length);
		
		double media = examen.media_pacientes(imcs_pacientes, numPaciente);
		System.out.printf("La media del paciente %d es %.2f", numPaciente, media);


	}

}
