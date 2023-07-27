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
public class PagInicio extends JPanel {

	public PagInicio() {
		setLayout(null);
        ImageIcon fondo1=  (new ImageIcon("images\\GOKU.png"));
	
		JLabel GOKI = new JLabel("");
		GOKI.setLocation(107, 101);
		GOKI.setSize(290, 237);
		add(GOKI);
		GOKI.setIcon(new ImageIcon(fondo1.getImage().getScaledInstance(GOKI.getWidth(), GOKI.getHeight(), Image.SCALE_SMOOTH)));
   
		JLabel lblNewLabel_1 = new JLabel("¡Bienvenido a este conversor!  ");
		lblNewLabel_1.setBounds(78, 49, 335, 26);
		lblNewLabel_1.setFont(new Font("Rockwell", Font.BOLD, 22));
		add(lblNewLabel_1);

	}
}
