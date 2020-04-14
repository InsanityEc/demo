import javax.swing.*;					//importar componentes interfaz
import java.awt.event.*;				//importar las funcionalidades (on click cosas asi)

public class Formulario4 extends JFrame implements ActionListener{ 				//clase-interfaz-funcionalidad formulario
	private JButton boton1;														//boton
	private JLabel label1;														//label
	private JLabel label2;	
	private JLabel label3;
	private JLabel label4;	
	private JButton cerrar;														//cerrar
	private JTextField numuno;
	private JTextField numdos;

	
	private String texto=("");													

	
	public Formulario4 (){										//constructor
		setLayout(null);
		

		label1 = new JLabel("Valor 1:");
		label1.setBounds(50,5,100,30);
		add(label1);

		label2 = new JLabel("Valor 2:");
		label2.setBounds(50,35,100,30);
		add(label2);

		numuno = new JTextField();							//campo de texto
		numuno.setBounds(120,10,150,30);
		add(numuno);

		numdos = new JTextField();							//campo de texto
		numdos.setBounds(10,10,150,30);
		add(numdos);

		boton1 = new JButton("Sumar");
		boton1.setBounds(10,80,100,30);
		add(boton1);
		boton1.addActionListener(this);	
		
		label3 = new JLabel("Resultado:");
		label2.setBounds(50,80,100,30);
		add(label2);

		label4 = new JLabel("");
		label4.setBounds(180,80,100,30);
		add(label4);

		
								//boton 1 agrega evento / funcion ActionListener(this) espera click en este boton

		cerrar = new JButton("cerrar");
		cerrar.setBounds(50,110,100,30);
		add(cerrar);
		cerrar.addActionListener(this);

		
	}

	public void actionPerformed(ActionEvent e){					// captura el evento en una "variable" //espacio en memoria e donde se aloja el evento
		if(e.getSource()==boton1){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			
			int resultado=0;		
			int uno=0;
			int dos=0;
				/*******************************PARSE**********************/
			String texto=label4.getText();				// asigna variable texto el valor del campo de texto1
			uno=Integer.parseInt(numuno.getText());					//guarda en texto lo q este en el campo de como numero PARSEO
			dos=Integer.parseInt(numdos.getText());
			resultado=uno+dos;
			label4.setText(""+resultado);							

			}

		if(e.getSource()==cerrar){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			System.exit(0);										//cerrar interfaz grafica
		}
	}

	public static void main(String[] args) {
		Formulario4 formulario1 = new Formulario4();
		formulario1.setBounds(0,0,300,300);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);

	}

}	
