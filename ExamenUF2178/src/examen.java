import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 *
 */
public class examen {

	/**
	 * Método que muestra la matriz de imcs por pantalla
	 * @param matriz la matriz a mostrar.
	 */
	public static void mostrar_imcs(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.2f ", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Función que calcula la media del paciente pasado como parámetro
	 * @param m la natriz con los valores de imc de los paciente
	 * @param paciente índice que indica de qué paciente se quiere calcular la media
	 *        debe estar entre 0 y lentgh-1
	 * @return 
	 */
	public static double media_pacientes(double m[][], int paciente) {
		double suma=0;
		if (paciente>=0 && paciente<m.length) {
			for (int j = 0; j < m[0].length; j++) {
				suma = suma + m[paciente][j];
			}
			return suma/m[0].length;
		} else {
			return -1;
		}
		
	}
}
