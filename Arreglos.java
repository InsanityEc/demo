import java.util.Scanner;
public class Arreglos{
	public static void main(String[] args) {
		/*ARREGLOS UNIDIMENSIONALES*********************************************************************
		int numeros[]= new int[5]; /*nombre vector[] = nueva tipo de variable y [tamaño(indice)]
		Scanner in= new Scanner(System.in);

		for (int i=0; i<numeros.length; i++) {
			System.out.print("Ingrese el valor "+i +" : ");
			numeros[i]=in.nextInt();
			System.out.println("");
		}
		for (int j=0; j<numeros.length; j++) {
			System.out.print("el valor "+j +" es : ");
			System.out.println(numeros[j]);
		}



		 System.out.println(nombre[3]); imptimir una posicion especifica*/

		

		/*Vector dinamico ********************************************************/
		/*SE USA EL for PARA HACER LAS DECLARACIONES  COSAS ASI

		
		Scanner in=new Scanner(System.in);
		int longitud=0;
		System.out.print("Indique la longitud del vector: ");
		longitud=in.nextInt();
		int numeros[]= new int[longitud];

		for (int i=0; i<longitud; i++) {
			System.out.print("Ingrese el valor "+(i+1) +" : ");
			numeros[i]=in.nextInt();
			System.out.println("");
		}

		for (int j=0; j<longitud; j++) {
			System.out.print("["+ numeros[j]+"] ");
		}
   */
		/*MATRICES***************************************************************/

		Scanner in=new Scanner(System.in);
		int fila=0;
		int columna=0;
		System.out.print("Indique la fila del vector: ");
		fila=in.nextInt();
		System.out.print("Indique la columna del vector: ");
		columna=in.nextInt();
		int numeros[][]= new int[fila][columna]; /*declaracion de matriz */
		int contador=1;

		for (int i=0; i<fila; i++){
			for (int j=0;j<columna;j++){
				numeros[i][j]=contador;
				contador++;
				System.out.print("["+ numeros[i][j]+"]");
			}
			System.out.println("");
		}



	}

}