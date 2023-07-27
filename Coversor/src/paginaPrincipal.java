import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;


public class paginaPrincipal extends JFrame {
    JPanel panel = new JPanel();
	
    private JPanel contentPane;


	PagMonedas p1 = new PagMonedas();
	PagTemperatura p2 = new PagTemperatura();
	PagInicio inicio = new PagInicio();
    JPanel contenedor = new JPanel();

    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paginaPrincipal frame = new paginaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public paginaPrincipal() {
	     inicio.setLocation(0,0);
		    inicio.setSize(500,400);
	        contenedor.removeAll();
	        contenedor.add(inicio, BorderLayout.CENTER);
	        contenedor.revalidate();
	        contenedor.repaint();
		initComponents();
		
	}
	
	public void initComponents() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 438);
		setTitle("Converssor");
		setLocationRelativeTo(null);
		
		paneles();
	    botones();

	}
	public void paneles() {

		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
        contentPane.setLayout(null);
        contenedor.setBounds(261, 0, 500, 400);
        contentPane.add(contenedor);
        contenedor.setLayout(null);
        panel.setBounds(0, 0, 263, 400);
        panel.setBackground(new Color(0, 0, 0));
        contentPane.add(panel);
        panel.setLayout(null);
               
		ImageIcon imagen=  (new ImageIcon("images\\ONE.png"));
		
		

        JLabel logo= new JLabel();
        logo.setBounds(33, 32, 187, 108);
        panel.add(logo);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon fondo1=  (new ImageIcon("images\\GOKU.png"));

   
        

		
	}
	public void botones() {

		//BOTON CONVERTIDOR DE DIVISAS 
        JButton divisas= new JButton("Conversor de divisas");
        divisas.setFont(new Font("Lucida Sans", Font.BOLD, 11));
        
        divisas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
		        p1.setLocation(0,0);
    		    p1.setSize(500,400); 		    
		        contenedor.removeAll();
		        contenedor.add(p1, BorderLayout.CENTER);
		        contenedor.revalidate();
		        contenedor.repaint();
        	}
        });
        
         divisas.setBounds(30, 245, 203, 39);
         panel.add(divisas);
         divisas.setBackground(new Color(50, 141, 130));
         divisas.setForeground(new Color(64, 0, 0));
         
         //BOTON CONVERTIDOR DE TEMPERATURA 
         JButton temperaturas = new JButton("Conversor de temperatura");
         temperaturas.setHorizontalAlignment(SwingConstants.LEFT);
         temperaturas.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
		        p2.setLocation(0,0);
    		    p2.setSize(500,400);

		        contenedor.removeAll();
		        contenedor.add(p2, BorderLayout.CENTER);
		        contenedor.revalidate();
		        contenedor.repaint();
         	
         	}
         });
         temperaturas.setForeground(new Color(64, 0, 0));
         temperaturas.setFont(new Font("Lucida Sans", Font.BOLD, 11));
         temperaturas.setBackground(new Color(0, 128, 128));
         temperaturas.setBounds(30, 308, 203, 39);
         panel.add(temperaturas);
         
         JButton Inicio = new JButton("Inicio");
         Inicio.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
		        inicio.setLocation(0,0);
    		    inicio.setSize(500,400);

		        contenedor.removeAll();
		        contenedor.add(inicio, BorderLayout.CENTER);
		        contenedor.revalidate();
		        contenedor.repaint();        	
         	}
         });
         Inicio.setForeground(new Color(64, 0, 0));
         Inicio.setFont(new Font("Lucida Sans", Font.BOLD, 11));
         Inicio.setBackground(new Color(0, 128, 128));
         Inicio.setBounds(30, 181, 203, 39);
         panel.add(Inicio);
	}
}
