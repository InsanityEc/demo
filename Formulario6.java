import javax.swing.*;					//importar componentes interfaz
import java.awt.*;						//todas las opciones de awt (componentes (color) de diseño disponibles)
import java.awt.event.*;				//importar las funcionalidades (on click cosas asi)

public class Formulario6 extends JFrame implements ActionListener{ 				//clase-interfaz-funcionalidad formulario
	private JComboBox red;
	private JComboBox blue;
	private JComboBox green;														//boton combobox
	private JButton boton1;
	private JLabel label1, label2, label3;

	
	public Formulario6 (){										//constructor
		setLayout(null);
		
		label1 = new JLabel("Rojo");
		label1.setBounds(10,10,100,10);
		add(label1);

		red = new JComboBox();
		red.setBounds(120,10,50,30);
		add(red);
		for (int i=0; i<=255; i++){
			red.addItem(String.valueOf(i));						//saca el valor de una variable en string PARSEO 2
		}

		label2 = new JLabel("Verde");
		label2.setBounds(10,50,100,10);
		add(label2);

		green = new JComboBox();
		green.setBounds(120,50,50,30);
		add(green);
		
		for (int j=0; j<=255; j++){
			green.addItem(String.valueOf(j));	
		}


		label3 = new JLabel("Azul");
		label3.setBounds(10,90,100,10);
		add(label3);

		blue = new JComboBox();
		blue.setBounds(120,90,50,30);
		add(blue);
		for (int k=0; k<=255; k++){
			blue.addItem(String.valueOf(k));	
		}	


		boton1 = new JButton ("Fijar color");
		boton1.setBounds(10,130,100,30);
		add(boton1);	
		boton1.addActionListener(this);


		
	}

	public void actionPerformed(ActionEvent e){					// captura el evento en una "variable" //espacio en memoria e donde se aloja el evento
		if(e.getSource()==boton1){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado
			
			String cad1=red.getSelectedItem().toString();
			String cad2=green.getSelectedItem().toString();
			String cad3=blue.getSelectedItem().toString();
			
			int rojo = Integer.parseInt(cad1);						//PARSE INTO TO STRING
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);

			Color color1 = new Color(rojo , verde , azul);			//combinacion de colores de la libreria awt
			boton1.setBackground(color1);

			}




	}

	public static void main(String[] args) {
		Formulario6 formulario1 = new Formulario6();
		formulario1.setBounds(0,0,300,300);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);

	}

}	
