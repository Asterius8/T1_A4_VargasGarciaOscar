import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaPrincipal extends JFrame {
	
	//Atributos-------------------------------------------------------------------------------------------
	JLabel txt_Estandar;
	JTextField caja_Num;
	JButton btn_Porcen, btn_Raiz, btn_Potenc, btn_Div_Num, btn_CE, btn_C, btn_borrar_Dig, btn_Div,
	btn_Siete, btn_Ocho, btn_Nueve, btn_Multi, btn_Cuatro, btn_Cinco, btn_Seis, btn_Res, btn_Uno, btn_Dos, 	btn_Tres, btn_Sum, btn_Negativo, btn_Cero, btn_Punto, btn_Igual;
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	Calculadora c1 = new Calculadora();
	
	double num1 = 0, num2 = 0,resultado;
	byte ultimoSigno;
	
	boolean banderasignos = false;
	//Constructor(es)-------------------------------------------------------------------------------------
	public VentanaPrincipal() {
	
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationRelativeTo(null);
		setTitle("Calculadora");
		setVisible(true);
		
//Etiqueta_Estandar----------------------------------------------------------------------------------------------------------------------------------------------------------------
		txt_Estandar = new JLabel("ESTÁNDAR");
		agregarComponente(txt_Estandar, 0, 0, 2, 1);
		
//Caja_Numeros---------------------------------------------------------------------------------------------------------------------------------------------------------------------
		caja_Num = new JTextField("0");
		caja_Num.setHorizontalAlignment(JTextField.RIGHT);
		caja_Num.setEditable(false);
		agregarComponente(caja_Num, 0, 1, 4, 2);
		caja_Num.setFont(new Font("Roboto",Font.BOLD, 35));
		
//Boton_Signo_Porcentaje-----------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Porcen = new JButton("%");
		agregarComponente(btn_Porcen, 0, 4, 1, 1);
		btn_Porcen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ultimoSigno = 5;
				num2 = Double.parseDouble( caja_Num.getText() );
				caja_Num.setText(String.valueOf( c1.realizarDivision(num2 ,100 )));
				
				
			}
		}); 
		
//Boton_Signo_Raiz-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Raiz = new JButton("√");
		agregarComponente(btn_Raiz, 1, 4, 1, 1);
		btn_Raiz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(caja_Num.getText());
				if(num1>=0) {
					
					caja_Num.setText(String.valueOf( c1.realizarRaiz(num1 )));
					
				}
				
			}
		});
		
//Boton_Signo_Potencia-------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Potenc = new JButton("x²");
		agregarComponente(btn_Potenc, 2, 4, 1, 1);
		btn_Potenc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(caja_Num.getText());
				caja_Num.setText(String.valueOf( c1.realizarMultiplicacion(num1 ,num1)));
				
			}
		});
//Boton_Signo_DividirNum-----------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Div_Num = new JButton("1/X");
		agregarComponente(btn_Div_Num, 3, 4, 1, 1);
		btn_Div_Num.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(caja_Num.getText());
				if(num1 != 0) {
					
					caja_Num.setText(String.valueOf( c1.realizarDivision(1 ,num1 )));
					
				}else {
					
					caja_Num.setText("division por cero");
					
				}
				
			}
		});

//Boton_Signo_CE------------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_CE = new JButton("CE");
		agregarComponente(btn_CE, 0, 5, 1, 1);
		btn_CE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				caja_Num.setText("");
				
			}
		});
//Boton_Signo_C------------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_C = new JButton("C");
		agregarComponente(btn_C, 1, 5, 1, 1);
		btn_C.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				num1 = 0;
				num2 = 0;
				
			}
		});

//Boton_Signo_BorrarDig------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_borrar_Dig = new JButton("⌫");
		agregarComponente(btn_borrar_Dig, 2, 5, 1, 1);
		btn_borrar_Dig.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (caja_Num.getText().length() != 0) {
					
					caja_Num.setText( caja_Num.getText().substring(0, caja_Num.getText().length() -1) );
					
				}
				
			}
		});
		
		
//Boton_Signo_Div------------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Div = new JButton("÷");
		agregarComponente(btn_Div, 3, 5, 1, 1);
		btn_Div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ultimoSigno = 4;
				num1 = Double.parseDouble(caja_Num.getText());
				banderasignos = true;
				caja_Num.setText( String.valueOf(num1) );
				
			}
		});
		
//Boton_#7-------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		btn_Siete = new JButton("7");
		agregarComponente(btn_Siete, 0, 6, 1, 1);
		btn_Siete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Siete);
				
			}
		});
		
//Boton_#8-------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		btn_Ocho = new JButton("8");
		agregarComponente(btn_Ocho, 1, 6, 1, 1);
		btn_Ocho.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Ocho);
				
			}
		});
		
//Boton_#9-------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		btn_Nueve = new JButton("9");
		agregarComponente(btn_Nueve, 2, 6, 1, 1);
		btn_Nueve.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Nueve);
				
			}
		});
		
//Boton_Signo_Multiplicacion-------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Multi = new JButton("X");
		agregarComponente(btn_Multi, 3, 6, 1, 1);
		btn_Multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ultimoSigno = 3;
				num1 = Double.parseDouble(caja_Num.getText());
				banderasignos = true;
				caja_Num.setText( String.valueOf(num1) );
			}
		});
		
//Boton_#4-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Cuatro = new JButton("4");
		agregarComponente(btn_Cuatro, 0, 7, 1, 1);
		btn_Cuatro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Cuatro);
				
			}
		});
		
//Boton_#5-------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		btn_Cinco = new JButton("5");
		agregarComponente(btn_Cinco, 1, 7, 1, 1);
		btn_Cinco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Cinco);
				
			}
		});
		
//Boton_#6-------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		btn_Seis = new JButton("6");
		agregarComponente(btn_Seis, 2, 7, 1, 1);
		btn_Seis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Seis);
				
			}
		});
		
//Boton_Signo_Menos----------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Res = new JButton("-");
		agregarComponente( btn_Res, 3, 7, 1, 1);
		btn_Res.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ultimoSigno = 2;
				num1 = Double.parseDouble(caja_Num.getText());
				banderasignos = true;
				caja_Num.setText( String.valueOf(num1) );
			}
			
		});
		
//Boton_#1-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		btn_Uno = new JButton("1");
		agregarComponente(btn_Uno, 0, 8, 1, 1);
		btn_Uno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Uno);
				
			}
		});
		
//Boton_#2-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		btn_Dos = new JButton("2");
		agregarComponente(btn_Dos, 1, 8, 1, 1);
		btn_Dos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Dos);
				
			}

		});
		
//Boton_#3-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		btn_Tres = new JButton("3");
		agregarComponente(btn_Tres, 2, 8, 1, 1);
		btn_Tres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Tres);
				
			}
			
		});
		
//Boton_Signo_Mas------------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Sum = new JButton("+");
		agregarComponente(btn_Sum, 3, 8, 1, 1);
		btn_Sum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ultimoSigno = 1;
				num1 = Double.parseDouble(caja_Num.getText());
				banderasignos = true;
				caja_Num.setText( String.valueOf(num1) );

			}
		});
		
//Boton_Signo_Negativo-------------------------------------------------------------------------------------------------------------------------------------------------------------	
		btn_Negativo = new JButton("±");
		agregarComponente(btn_Negativo, 0, 9, 1, 1);
		btn_Negativo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				caja_Num.setText( String.valueOf(c1.numero_Negativo(Double.parseDouble(caja_Num.getText()))) );
				
			}
			
		});
		
		
//Boton_#3-------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		btn_Cero = new JButton("0");
		agregarComponente(btn_Cero, 1, 9, 1, 1);
		btn_Cero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				escritura_En_Caja(btn_Cero);
				
			}
			
		});
//Boton_Signo_Punto----------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Punto = new JButton(".");
		agregarComponente(btn_Punto, 2, 9, 1, 1);
		btn_Punto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(caja_Num.getText().contains(".") ) {
					
					System.out.println("Ya hay un punto");
					
				}else {
					
					escritura_En_Caja(btn_Punto);
					
				}
				
			}
		});
		
//Boton_Signo_Igual----------------------------------------------------------------------------------------------------------------------------------------------------------------
		btn_Igual = new JButton("=");
		agregarComponente(btn_Igual, 3, 9, 1, 1);
		btn_Igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble( caja_Num.getText() );
				
				if(ultimoSigno == 1) {
					
					caja_Num.setText(String.valueOf( c1.realizarSuma(num1 ,num2 )));
					
				}else if(ultimoSigno == 2) {
					
					caja_Num.setText(String.valueOf( c1.realizarResta(num1 ,num2 )));
					
				}else if(ultimoSigno == 3) {
					
					caja_Num.setText(String.valueOf( c1.realizarMultiplicacion(num1 ,num2 )));
					
				}else if(ultimoSigno == 4) {
					
					if (num2 == 0) {
						
						caja_Num.setText("division por cero");
						
					}else {
						
						caja_Num.setText(String.valueOf( c1.realizarDivision(num1 ,num2 )));
						
					}
					
				}else if(ultimoSigno == 5) {
					
					caja_Num.setText(String.valueOf( c1.realizarMultiplicacion(num1 ,num2 )));
					
				}
				
			}
		});
		
		
		pack();
		setLocationRelativeTo(null);
		
	}//Fin Constructor
	
//Otros Metodos--------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
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
	
	public void escritura_En_Caja(JButton boton ) {

		
		if (caja_Num.getText().equals("0") || banderasignos) {
			
			caja_Num.setText(boton.getText());
			banderasignos = false;
			
		}else {
			
			caja_Num.setText(caja_Num.getText() + boton.getText());
			
		}
		
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
