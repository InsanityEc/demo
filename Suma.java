import java.util.Scanner; /*libreria ingreso de datos*/
public class Suma
{
	public static void main(String args[])
	{
		

		Scanner in = new Scanner(System.in); /*tipo de objeto - nombre del objeto = nuevo tipo de objeto (introducir datos con el tecaldo)*/

		String nombre ="";
		int a=5;
		int b=2;
		int c=0;
		
		System.out.println("Cual es su nombre: ");
		nombre=in.nextLine (); /*tipo texto para almacenar nextLine*/
		System.out.println("Ingrese a: ");
		a=in.nextInt ();/*tipo texto para almacenar nextInt*/
		System.out.println("Ingrese b: ");
		b=in.nextInt ();/*tipo texto para almacenar nextInt*/

		c=a+b;
		
				
		System.out.println("Hola "+nombre+" El valor de la suma es: " + c);
		

	}
}