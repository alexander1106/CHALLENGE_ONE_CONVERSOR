import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class PagMonedas extends JPanel implements Convertir, Botones{
	
	JPanel panelMonedas = new JPanel();	


    JLabel resultado = new JLabel("");
    JTextField ingresar = new JTextField();
    
 	Object[] monedas = {"De Soles a Dolares" , "De Soles a Euros", "De Soles a Libras Esterlinas",
    		"De Soles a Yen Japonés" , "De Soles a Won sul-coreano", "De Dolares a Soles" , "De Euros a Soles", 
    		"De Libras Esterlinas a Soles","De Yen Japonés a Soles" , "De Won sul-coreano a Soles"};

	JComboBox seleccionar = new JComboBox(monedas);

	public PagMonedas() {		
		this.setLayout(null);
		panelMonedas.setLayout(null);
		panelMonedas.setBounds(0, 0, 500, 400);
		add(panelMonedas);
		
		seleccionar.setBounds(261, 171, 170, 37);
		panelMonedas.add(seleccionar);
		crearJlabel();
		crearBotones();	
		resultado();
		cajaTexto();		
		fondos();		
	}



	

	@Override
	public void crearBotones() {
		
		JButton borrar = new JButton("BORRAR");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresar.setText("");
				resultado.setText("");
			}
		});
		borrar.setForeground(Color.WHITE);
		borrar.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		borrar.setBackground(Color.BLACK);
		borrar.setBounds(264, 233, 115, 30);
		panelMonedas.add(borrar);
		
		JButton convertir = new JButton("CONVERTIR");
		convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertir();
			}	
	    }
		);
		
		convertir.setForeground(Color.WHITE);
		convertir.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		convertir.setBackground(Color.BLACK);
		convertir.setBounds(92, 233, 115, 30);
		panelMonedas.add(convertir);		
	}

	@Override
	public void convertir() {
		Double valor =0.0;
		String mensaje ="";	        
		try {
			double cantidad = Double.parseDouble(ingresar.getText());
	
			switch (seleccionar.getSelectedItem().toString()) {
				case "De Soles a Dolares":
				    valor = cantidad * 0.28;
				    mensaje = cantidad + " soles son iguales a " + decimalFormat.format(valor) + " Dolares";
				    break;
				case "De Soles a Euros":
				    valor = cantidad * 0.25;
					mensaje = cantidad + " soles son iguales a " + decimalFormat.format(valor) +  " Euros";
				    break;
				case "De Soles a Libras Esterlinas":
				    valor = cantidad * 0.22;
				    mensaje = cantidad + " soles son iguales a " + decimalFormat.format(valor) + " Libras Esterlinas";

				    break;
				case "De Soles a Yen Japonés":
				    valor = cantidad * 39.73;
				    mensaje = cantidad + " soles son iguales a " + decimalFormat.format(valor) + " Yen Japonés";
				    break;
				case "De Soles a Won sul-coreano":
				    valor = cantidad * 363.17;
				    mensaje = cantidad + " soles son iguales a " + decimalFormat.format(valor) + " Won sul-coreano";
				    break;
				case "De Dolares a Soles":
				    valor = cantidad * 3.62;
				    mensaje = cantidad + " dolares son iguales a " + decimalFormat.format(valor) +  " Soles";
				    break;
				case "De Euros a Soles":
				    valor = cantidad * 3.96;
				    mensaje = cantidad + " euros son iguales a " + decimalFormat.format(valor) +  " Soles";
				    break;
				case "De Libras Esterlinas a Soles":
				    valor = cantidad * 4.61;
				    mensaje = cantidad + " Libras Esterlinas a " + decimalFormat.format(valor) + " Soles";
				    break;
				case "De Yen Japonés a Soles":
				    valor = cantidad / 39.73;
				    mensaje = cantidad + " Yen Japonés Soles a " + decimalFormat.format(valor) + " Soles";
				    break;
				case "De Won sul-coreano a Soles":
				    valor = cantidad / 363.17;
				    mensaje = cantidad + " Won sul-coreano a " + decimalFormat.format(valor) + " Soles";
				    break;
				}resultado.setText( mensaje);
				
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ingrese solo números", "Error", JOptionPane.ERROR_MESSAGE);
			ingresar.setText("");
			resultado.setText("");}
	}


	@Override
	public void crearJlabel() {
	
		JLabel titulo = new JLabel("CONVERSOR DE DIVISAS");
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		titulo.setBounds(83, 45, 350, 54);
		panelMonedas.add(titulo);
		
		JLabel titulo_ingresar = new JLabel("Ingrese la cantidad ");
		titulo_ingresar.setBackground(new Color(0, 0, 0));
		titulo_ingresar.setForeground(new Color(255, 255, 255));
		titulo_ingresar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		titulo_ingresar.setBounds(45, 117, 202, 30);
		panelMonedas.add(titulo_ingresar);
		
		JLabel titulo_elegir = new JLabel("Seleccione el tipo de divisas ");
		titulo_elegir.setForeground(new Color(255, 255, 255));
		titulo_elegir.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		titulo_elegir.setBounds(261, 117, 210, 30);
		panelMonedas.add(titulo_elegir);		
	}
	@Override
	public void resultado() {
		
		JPanel contenedor_resultado = new JPanel();
		contenedor_resultado.setBounds(45, 294, 394, 63);
		panelMonedas.add(contenedor_resultado);
		contenedor_resultado.setLayout(null);
		resultado.setBounds(10, 11, 353, 47);
		contenedor_resultado.add(resultado);		
	}
	
	@Override
	public void fondos() {
		ImageIcon fondo1=  (new ImageIcon("images\\fondo_dinero.jpg"));
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 500, 400);
		panelMonedas.add(fondo);
		fondo.setIcon(new ImageIcon(fondo1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH)));
	}
	@Override
	public void cajaTexto() {
		
		ingresar.setForeground(Color.BLUE);
		ingresar.setBackground(Color.WHITE);
		ingresar.setBounds(45, 171, 162, 37);
		panelMonedas.add(ingresar);		
	}
	
	

	


	
	
}
