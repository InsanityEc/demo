import java.util.Scanner;
public class Cadenas{
	public static void main(String[] args) {
		/* Comparar cadenas de nombres
		String nombre="";
		int numero=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un nombre:");
		nombre= entrada.nextLine();
		System.out.println("Ingrese un numero:");
		numero = entrada.nextInt();


		if (nombre.equals("juan") && numero==9){
			System.out.println("Hola Juan");
		}else {
			System.out.println("Nombre erroneo");
		}  */
		
		/************************************ METODO length Y substring***********************/
		String cadena_original="", cadena_subs="";
		int num_caracteres=0, desde=0, hasta=0;
		Scanner in= new Scanner(System.in);

		System.out.println("Introduce una cadena de caracteres: ");
		cadena_original=in.nextLine();

		num_caracteres=cadena_original.length(); /*cuenta caracteres que tiene la cadena*/
		System.out.println("La cadena "+ cadena_original+" tiene una longitiud de: "+num_caracteres);

		System.out.println("Desde donde deseas cortar: ");
		desde=in.nextInt();
		System.out.println("Hasta donde deseas cortar: ");
		hasta=in.nextInt();

		cadena_subs=cadena_original.substring(desde,hasta); /*estrae desde hasta de una cadena*/ 
		System.out.println("La nueva cadena es: " + cadena_subs);


	}
}