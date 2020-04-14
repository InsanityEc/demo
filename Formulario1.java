import javax.swing.*;

public class Formulario1 extends JFrame{

	private JLabel label1;
	private JLabel label2;

	public Formulario1(){
		setLayout(null);
		label1= new JLabel("Interfaz grafica");
		label1.setBounds(10,20,300,30);
		add(label1);
		label2= new JLabel("Interfaz grafica");
		label2.setBounds(10,100,100,30);
		add(label2);
	}

	public static void main(String[] args) {
		Formulario1 formulario1=new Formulario1();
		formulario1.setBounds(0,0,300,200);							//no se puede modificar el tamaño de la interfaz
		formulario1.setResizable(false); 							//ancho, alto
		formulario1.setVisible(true);								//visible
		formulario1.setLocationRelativeTo(null);					//centrado siempre--omite setbounds x y 
		
	}
}