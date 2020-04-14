import javax.swing.*;					//importar componentes interfaz
import java.awt.event.*;				//importar las funcionalidades (on click cosas asi)

public class Formulario5 extends JFrame implements ItemListener{ 				//clase-interfaz-funcionalidad formulario
	private JComboBox combo1;														//boton combobox

	
	public Formulario5 (){										//constructor
		setLayout(null);
		

		combo1 = new JComboBox();
		combo1.setBounds(10,10,80,20);
		add(combo1);

		combo1.addItem("rojo");
		combo1.addItem("verde");
		combo1.addItem("azul");
		combo1.addItem("amarillo");
		combo1.addItem("cafe");
		combo1.addItem("negro");
		combo1.addItemListener(this);						//combo 1 agrega evento / funcion additemlestener(this) espera click en esta opcion

		
		
	}

	public void itemStateChanged(ItemEvent e){					// captura el evento en una "variable" //espacio en memoria e donde se aloja el evento
		if(e.getSource()==combo1){								//.getSource el evento se guarda en e y valida tomando 1-el evento y 2-compara en el boton1 que debdio ser presionado

			String texto = combo1.getSelectedItem().toString();			//Selecciona el item y lo cambia a string
			setTitle(texto);
			}

	}

	public static void main(String[] args) {
		Formulario5 formulario1 = new Formulario5();
		formulario1.setBounds(0,0,300,300);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);

	}

}	
