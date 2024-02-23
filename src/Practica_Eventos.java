import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	
	//Atributos-------------------------------------------------------------------------------------------
	JLabel txt_Estandar;
	JTextField caja_Num;
	JButton btn_Porcen, btn_Raiz, btn_Potenc, btn_Div_Num, btn_CE, btn_C, btn_borrar_Dig, btn_Div,
	btn_Siete, btn_Ocho, btn_Nueve, btn_Multi, btn_Cuatro, btn_Cinco, btn_Seis, btn_Res, btn_Uno, btn_Dos, 	btn_Tres, btn_Sum, btn_Negativo, btn_Cero, btn_Punto, btn_Igual;
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	//Constructor(es)-------------------------------------------------------------------------------------
	public VentanaPrincipal() {
	
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationRelativeTo(null);
		setTitle("Calculadora");
		setVisible(true);
		
		txt_Estandar = new JLabel("ESTÁNDAR");
		agregarComponente(txt_Estandar, 0, 0, 2, 1);
		
		caja_Num = new JTextField("0");
		caja_Num.setHorizontalAlignment(JTextField.RIGHT);
		caja_Num.setEditable(false);
		agregarComponente(caja_Num, 0, 1, 4, 2);
		caja_Num.setFont(new Font("Roboto",Font.BOLD, 35));
		
		btn_Porcen = new JButton("%");
		agregarComponente(btn_Porcen, 0, 4, 1, 1);
		
		btn_Raiz = new JButton("√");
		agregarComponente(btn_Raiz, 1, 4, 1, 1);
		
		btn_Potenc = new JButton("x²");
		agregarComponente(btn_Potenc, 2, 4, 1, 1);
		
		btn_Div_Num = new JButton("1/X");
		agregarComponente(btn_Div_Num, 3, 4, 1, 1);
		
		btn_CE = new JButton("CE");
		agregarComponente(btn_CE, 0, 5, 1, 1);
		
		btn_C = new JButton("C");
		agregarComponente(btn_C, 1, 5, 1, 1);
		
		btn_borrar_Dig = new JButton("⌫");
		agregarComponente(btn_borrar_Dig, 2, 5, 1, 1);
		
		btn_Div = new JButton("÷");
		agregarComponente(btn_Div, 3, 5, 1, 1);
		
		btn_Siete = new JButton("7");
		agregarComponente(btn_Siete, 0, 6, 1, 1);
		
		btn_Ocho = new JButton("8");
		agregarComponente(btn_Ocho, 1, 6, 1, 1);
		
		btn_Nueve = new JButton("9");
		agregarComponente(btn_Nueve, 2, 6, 1, 1);
		
		btn_Multi = new JButton("X");
		agregarComponente(btn_Multi, 3, 6, 1, 1);
		
		btn_Cuatro = new JButton("4");
		agregarComponente(btn_Cuatro, 0, 7, 1, 1);
		
		btn_Cinco = new JButton("5");
		agregarComponente(btn_Cinco, 1, 7, 1, 1);
		
		btn_Seis = new JButton("6");
		agregarComponente(btn_Seis, 2, 7, 1, 1);
		
		btn_Res = new JButton("-");
		agregarComponente(btn_Res, 3, 7, 1, 1);
		
		btn_Uno = new JButton("1");
		agregarComponente(btn_Uno, 0, 8, 1, 1);
		
		btn_Dos = new JButton("2");
		agregarComponente(btn_Dos, 1, 8, 1, 1);
		
		btn_Tres = new JButton("3");
		agregarComponente(btn_Tres, 2, 8, 1, 1);
		
		btn_Sum = new JButton("+");
		agregarComponente(btn_Sum, 3, 8, 1, 1);
		
		btn_Negativo = new JButton("±");
		agregarComponente(btn_Negativo, 0, 9, 1, 1);
		
		btn_Cero = new JButton("0");
		agregarComponente(btn_Cero, 1, 9, 1, 1);
		
		btn_Punto = new JButton(".");
		agregarComponente(btn_Punto, 2, 9, 1, 1);
		
		btn_Igual = new JButton("=");
		agregarComponente(btn_Igual, 3, 9, 1, 1);
		
		
		pack();
		setLocationRelativeTo(null);
	}
	
	//Otros Metodos---------------------------------------------------------------------------------------
	
	public void agregarComponente(JComponent c, int x, int y, int w, int h){
		
		gbc.gridx = x;
		gbc.gridy =y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		//gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		c.setFont(new Font("Roboto",Font.BOLD, 18));
		add(c);
		
	}//Metodo
	
}

public class Practica_Eventos {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaPrincipal();
			}
		}
		);
		
	}

}
