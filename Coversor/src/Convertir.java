import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public interface Convertir {

    DecimalFormat decimalFormat = new DecimalFormat("#0.00");

    public void convertir();
    public void crearJlabel();
    public void resultado();
    public void fondos();
    public void cajaTexto();
}
