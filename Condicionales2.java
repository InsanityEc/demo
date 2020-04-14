import java.util.Scanner;
public class Condicionales2{
	public static void main(String[] args) {
		
		int operacion= 0;
		int num_uno= 0;
		int num_dos= 0;
		int resultado = 0;


		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un valor: ");
		num_uno = entrada.nextInt();
		System.out.println("");

		System.out.print("Ingrese otro valor: ");
		num_dos = entrada.nextInt();
		System.out.println("");

		System.out.print("Ingrese una opcion: ");
		operacion = entrada.nextInt();
		System.out.println("");

		switch(operacion){

			case 1:resultado=num_dos+num_uno;
					System.out.println("El resultado de la suma es: "+resultado);
			break;

			case 2:resultado=num_dos-num_uno;
					System.out.println("El resultado de la resta es: "+resultado);
			break;

			case 3:resultado=num_dos*num_uno;
					System.out.println("El resultado de la multiplicacion es: "+resultado);
			break;

			case 4:resultado=num_dos/num_uno;
					System.out.println("El resultado de la division es: "+resultado);
			break;

			default: System.out.println("La opcion no existe");
			break;

		}

	}
}
