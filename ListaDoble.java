package musica;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ListaDoble extends JFrame implements ActionListener{
	
	private JLabel lbl_nombre, lbl_matricula, lbl_promedio, lbl_mensaje, lbl_imprimir;
	private JTextField tf_nombre, tf_matricula, tf_promedio;
	private JButton btn_agregar, btn_eliminar, btn_derecha, btn_izquierda, btn_buscar, btn_vacio;
	private JTextArea ta_imprimir;
	private JScrollPane scroll;
	private TestListaDoble ld = new TestListaDoble();//está al revez
	
	public ListaDoble(){
		super("Lista Doblemente Ligada");
		setSize(250, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		lbl_nombre = new JLabel("Nombre:");
		add(lbl_nombre);
		tf_nombre = new JTextField(20);
		add(tf_nombre);
		lbl_matricula = new JLabel("Matricula:");
		add(lbl_matricula);
		tf_matricula = new JTextField(20);
		add(tf_matricula);
		lbl_promedio = new JLabel("Promedio:");
		add(lbl_promedio);
		tf_promedio = new JTextField(20);
		add(tf_promedio);
		
		lbl_imprimir = new JLabel("Imprimir");
		add(lbl_imprimir);
		
		ta_imprimir = new JTextArea(10, 20);
		scroll = new JScrollPane(ta_imprimir);
		add(scroll);
		
		btn_vacio = new JButton("Vacio");
		btn_vacio.addActionListener(this);
		add(btn_vacio);
		btn_agregar = new JButton("Agregar");
		btn_agregar.addActionListener(this);
		add(btn_agregar);
		btn_eliminar = new JButton("Eliminar");
		btn_eliminar.addActionListener(this);
		add(btn_eliminar);
		btn_derecha = new JButton("Recorrer Derecha");
		btn_derecha.addActionListener(this);
		add(btn_derecha);
		btn_izquierda = new JButton("Recorrer Izquierda");
		btn_izquierda.addActionListener(this);
		add(btn_izquierda);
		btn_buscar = new JButton("Buscar");
		btn_buscar.addActionListener(this);
		add(btn_buscar);
		
		lbl_mensaje = new JLabel();
		add(lbl_mensaje);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ListaDoble();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btn_vacio){
			if(ld.isVacio()){
				ta_imprimir.setText("Lista Doble Vacia");
			}
			else{
				ta_imprimir.setText("Lista Doble Con Datos");
			}
		}
		
		if(arg0.getSource()==btn_agregar){
			if(tf_nombre.getText().isEmpty() || tf_matricula.getText().isEmpty() || tf_promedio.getText().isEmpty()){
				ta_imprimir.setText("Complemente los datos");
			}
			else{
				Alumno nuevo = new Alumno();
				nuevo.setNombre(tf_nombre.getText());
				nuevo.setMatricula(tf_matricula.getText());
				nuevo.setPromedio(Double.valueOf(tf_promedio.getText()));
				ld.agregar(nuevo);
			}
		}
		
		if(arg0.getSource()==btn_derecha){
			if(ld.isVacio()){
				ta_imprimir.setText("Lista Doble Vacia");
			}
			else{
				ta_imprimir.setText(ld.recorrerDerecha().toString());
			}
		}
		
		if(arg0.getSource()==btn_izquierda){
			if(ld.isVacio()){
				ta_imprimir.setText("Lista Doble Vacia");
			}
			else{
				ta_imprimir.setText(ld.recorrerIzquierda().toString());
			}
		}
	}
}