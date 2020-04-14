import javax.swing.*;											//libreria interfaz grafica

public class Formulario extends JFrame{
	private JLabel label1;  									//Jlabel crear etiquetas de formulario

	public Formulario(){										//constructor debe llamarse igual que la clase 
		setLayout(null);
		label1 = new JLabel("la geekpedia");					//null para q no ponga donde sea
		label1.setBounds(10,20,200,300); 						//X,Y,ancho, alto
		add(label1);
	}

	public static void main(String args[]) {
		Formulario formulario1= new Formulario();                //crear objeto tipo Formulario (nombre de la clase)
		formulario1.setBounds(0,0,400,300);						 //	X,Y,ancho, alto (x,y en 0 para dar location relative)
		formulario1.setVisible(true);							 //true para q se vea, false para q se oculte
		formulario1.setLocationRelativeTo(null);				 // poner posicion relativa

	}

}