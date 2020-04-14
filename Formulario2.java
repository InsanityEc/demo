import javax.swing.*;					//importar componentes interfaz
import java.awt.event.*;				//importar las funcionalidades (on click cosas asi)

public class Formulario2 extends JFrame implements ActionListener{ 							//clase-interfaz-funcionalidad formulario
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JLabel label1;
	JButton cerrar;
	
	public Formulario2 (){
		setLayout(null);
		boton1 = new JButton("1");
		boton1.setBounds(10,100,90,30);
		add(boton1);
		boton1.addActionListener(this);							//boton 1 agrega evento / funcion ActionListener(this) espera click en este boton

		boton2 = new JButton("2");
		boton2.setBounds(110,100,90,30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("3");
		boton3.setBounds(210,100,90,30);
		add(boton3);
		boton3.addActionListener(this);

		label1 = new JLabel("En espera...");
		label1.setBounds(10,10,300,30);
		add(label1);

		cerrar = new JButton("cerrar");
		cerrar.setBounds(110,150,90,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){					// captura el evento en una "variable" //espacio en memoria e donde se aloja el evento
		if(e.getSource()==boton1){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			label1.setText("Has presionado el boton1");										//cambia el texto del label
		}

		if(e.getSource()==boton2){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			label1.setText("Has presionado el boton2");										
		}

		if(e.getSource()==boton3){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			label1.setText("Has presionado el boton3");										
		}

		if(e.getSource()==cerrar){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			System.exit(0);										//cerrar interfaz grafica
		}
	}

	public static void main(String[] args) {
		Formulario2 formulario1 = new Formulario2();
		formulario1.setBounds(0,0,350,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);

	}

}	
