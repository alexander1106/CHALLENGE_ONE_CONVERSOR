import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class PagTemperatura extends JPanel implements Convertir, Botones {
	JPanel panelTem = new JPanel();	


    JLabel resultado = new JLabel("");
    JTextField ingresar = new JTextField();
    
  	Object[] valorTemperatura= {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Kelvin",
    		"Grados Fahrenheit a Grados Celsius", "Kelvin a Grados Celsius", "Kelvin a Grados Fahrenheit"};

		JComboBox seleccionar = new JComboBox(valorTemperatura);
	/**
	 * Create the panel.
	 */
		
		
	public PagTemperatura() {
		
		this.setLayout(null);
		panelTem.setLayout(null);
		panelTem.setBounds(0, 0, 500, 400);
		add(panelTem);
		
		seleccionar.setBounds(250, 171, 170, 37);
		panelTem.add(seleccionar);
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
		borrar.setBounds(250, 233, 115, 30);
		panelTem.add(borrar);
		
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
		convertir.setBounds(102, 233, 115, 30);
		panelTem.add(convertir);		
	}

	@Override
	public void convertir() {
		Double valor =0.0;
		String mensaje ="";
			                
	        try {
	            double cantidad = Double.parseDouble(ingresar.getText());

	            switch (seleccionar.getSelectedItem().toString()) {
				case "Grados Celsius a Grados Fahrenheit": {				
					valor = (double)((cantidad* 9/5) + 32);
					mensaje =  cantidad + " grados Celsius son " +  decimalFormat.format(valor) + " grados Fahrenheit";
					break;}
				
				
				case "Grados Celsius a Kelvin":{
					valor = (double)(cantidad +273.15 );
					mensaje = cantidad + " grados Celsius son " + decimalFormat.format(valor) + " grados Kelvin";
					break;}
				
				case "Grados Fahrenheit a Grados Celsius":{
					valor = (double)(cantidad- 32)*5/9;
					mensaje = cantidad + " grados Fahrenheit son " + decimalFormat.format(valor) + " grados Celsius";
					break;}
				
				case "Kelvin a Grados Celsius":{
					valor = cantidad- 273.15;
					mensaje = cantidad + " grados Kelvin son " + decimalFormat.format(valor) + " grados Celsius";
					break;}
				
				case "Kelvin a Grados Fahrenheit":{
					valor = (double) (cantidad-273.15)*9/5 ;
					mensaje = cantidad + " grados Kelvin son " + decimalFormat.format(valor) + " grados Fahrenheit";
					break;}
	        }
	        
	            resultado.setText(  mensaje);
	        } catch (NumberFormatException ex) {
	        	JOptionPane.showMessageDialog(null, "Ingrese solo números", "Error", JOptionPane.ERROR_MESSAGE);
				ingresar.setText("");
				resultado.setText("");
	        }
	}

	@Override
	public void crearJlabel() {
		JLabel titulo = new JLabel("CONVERSOR DE TEMPERATURA");
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		titulo.setBounds(51, 35, 393, 59);
		panelTem.add(titulo);
		
		JLabel inserte_cantidad = new JLabel("Ingrese la cantidad ");
		inserte_cantidad.setForeground(new Color(255, 255, 255));
		inserte_cantidad.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		inserte_cantidad.setBounds(51, 123, 202, 37);
		panelTem.add(inserte_cantidad);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccione el tipo de temperatura");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(250, 129, 240, 24);
		panelTem.add(lblNewLabel_1_1);
	 			
	}

	@Override
	public void resultado() {

		JPanel contenedor_resultado = new JPanel();
		contenedor_resultado.setBounds(57, 294, 373, 63);
		panelTem.add(contenedor_resultado);
		contenedor_resultado.setLayout(null);
		resultado.setBounds(10, 11, 353, 47);
		contenedor_resultado.add(resultado);	
	}

	@Override
	public void fondos() {
		ImageIcon fondo1=  (new ImageIcon("images\\tempera.jpg"));
 		JLabel fondo = new JLabel("");
 		fondo.setBounds(0, 0, 500, 400);
 		panelTem.add(fondo);
 		fondo.setIcon(new ImageIcon(fondo1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH)));	
	}


	@Override
	public void cajaTexto() {
		
		ingresar.setForeground(Color.BLUE);
		ingresar.setBackground(Color.WHITE);
		ingresar.setBounds(51, 171, 162, 37);
		panelTem.add(ingresar);		
	}
}
