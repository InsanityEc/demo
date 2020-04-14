import java.util.Scanner;

public class Sistema{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nombre="";
		int clave=0, antiguedad=0;

		System.out.println("**********************************************");
		System.out.println("*Bienvenido al Sistema Vacacional Systemcheck*");
		System.out.println("**********************************************");
		System.out.println("");
		System.out.println("");

		System.out.print("Nombre del trabajador: ");
		nombre= entrada.nextLine();
		System.out.println("");

		System.out.print("Ingrese la antiguedad: ");
		antiguedad = entrada.nextInt();
		System.out.println("");

		System.out.print("Ingrese la clave: ");
		clave = entrada.nextInt();
		System.out.println("");

		if (clave==1){

			if (antiguedad==1){
				System.out.println("El trabajador "+nombre+"Tiene asisgnados 6 dias");
			} else if (antiguedad>=2 && antiguedad<=6) {
				System.out.println("El trabajador "+nombre+"Tiene asisgnados 14 dias");
			} else if (antiguedad>=7){
				System.out.println("El trabajador "+nombre+"Tiene asisgnados 20 dias");
			} else {
				System.out.println("El trabajador "+nombre+"no Tiene asisgnados dias");
			}

		}else if (clave==2){
			if (antiguedad==1){
				System.out.println("El trabajador "+nombre+"Tiene asisgnados 7 dias");
			} else if (antiguedad>=2 && antiguedad<=6) {
				System.out.println("El trabajador "+nombre+"Tiene asisgnados 15 dias");
			} else if (antiguedad>=7){
				System.out.println("El trabajador "+nombre+"Tiene asisgnados 22 dias");
			} else {
				System.out.println("El trabajador "+nombre+"no Tiene asisgnados dias");
			}

		}else if (clave==3){
			if (antiguedad==1){
				System.out.println("El trabajador "+nombre+" Tiene asisgnados 10 dias");
			} else if (antiguedad>=2 && antiguedad<=6) {
				System.out.println("El trabajador "+nombre+" Tiene asisgnados 20 dias");
			} else if (antiguedad>=7){
				System.out.println("El trabajador "+nombre+" Tiene asisgnados 30 dias");
			} else {
				System.out.println("El trabajador "+nombre+" no Tiene asisgnados dias");
			}

		} else {

			System.out.println("Error, la clave es incorrecta!");
		}


	}
}