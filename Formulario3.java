import javax.swing.*;					//importar componentes interfaz
import java.awt.event.*;				//importar las funcionalidades (on click cosas asi)

public class Formulario3 extends JFrame implements ActionListener{ 				//clase-interfaz-funcionalidad formulario
	private JButton boton1;														//boton
	private JLabel label1;														//label
	private JButton cerrar;														//cerrar
	private JTextField textfield1;												//campo texto
	private JScrollPane scrollpane1;											//scroll del are atexto
	private JTextArea textarea1;												//area texto

	String texto="";															//variable texto

	
	public Formulario3 (){										//constructor
		setLayout(null);
		

		/*label1 = new JLabel("Usuario:");
		label1.setBounds(10,10,300,30);
		add(label1);*/

		boton1 = new JButton("Agregar");
		boton1.setBounds(250,10,100,30);
		add(boton1);
		boton1.addActionListener(this);							//boton 1 agrega evento / funcion ActionListener(this) espera click en este boton

		textfield1 = new JTextField();							//campo de texto
		textfield1.setBounds(10,10,200,30);
		add(textfield1);

		cerrar = new JButton("cerrar");
		cerrar.setBounds(300,380,90,30);
		add(cerrar);
		cerrar.addActionListener(this);

		textarea1=new JTextArea();								//area de texto
		scrollpane1=new JScrollPane(textarea1);					//scroll del area de texto
		scrollpane1.setBounds(10,50,400,300);
		add(scrollpane1);

	}

	public void actionPerformed(ActionEvent e){					// captura el evento en una "variable" //espacio en memoria e donde se aloja el evento
		if(e.getSource()==boton1){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			
			/*String texto=textfield1.getText();				// asigna variable texto el valor del campo de texto1
			setTitle(texto);									// pone de titulo la variable texto*/
			texto+=textfield1.getText()+"\n";					//guarda en texto lo q este en el campo de texto
			textarea1.setText(texto);							
			textfield1.setText("");
		}

		if(e.getSource()==cerrar){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			System.exit(0);										//cerrar interfaz grafica
		}
	}

	public static void main(String[] args) {
		Formulario3 formulario1 = new Formulario3();
		formulario1.setBounds(0,0,700,600);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);

	}

}	
