package Notas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField porcentaje1; // hereda la clase Jframe
	private JTextField porcentaje2;
	private JTextField porcentaje3;
	private JTextField porcentaje4;
	private JTextField porcentaje5;
	private JTextField porcentaje6;
	private JTextField valornota1;
	private JTextField valornota2;
	private JTextField valornota3;
	private JTextField valornota4;
	private JTextField valornota5;
	private JTextField valornota6;
	private JButton btnCalcular;
	private JButton btnlimpiar;
	private JLabel equivalencia1;
	private JLabel equivalencia2;
	private JLabel equivalencia3;
	private JLabel equivalencia4;
	private JLabel equivalencia5;
	private JLabel equivalencia6;
	private JLabel lbltotal;

	public Interfaz() {
		setTitle("BY jgzzl v1.0 ");
		// setTitle("v 1.0 byJgzzL");
		getContentPane().setBackground(new Color(0, 0, 0));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().setForeground(Color.GREEN); // constructor
		getContentPane().setLayout(null); // es como la platilla

		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBackground(new Color(72, 209, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(127, 36, 46, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 2");
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1.setBackground(new Color(72, 209, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(182, 36, 46, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota 3");
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setBackground(new Color(72, 209, 204));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(236, 36, 46, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nota 4");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setBackground(new Color(72, 209, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(292, 36, 46, 14);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Nota 5");
		lblNewLabel_4.setForeground(new Color(0, 255, 0));
		lblNewLabel_4.setBackground(new Color(72, 209, 204));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(348, 36, 46, 14);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Nota 6");
		lblNewLabel_5.setForeground(new Color(0, 255, 0));
		lblNewLabel_5.setBackground(new Color(72, 209, 204));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(404, 36, 46, 14);
		getContentPane().add(lblNewLabel_5);

		porcentaje1 = new JTextField();
		porcentaje1.setText("0");
		porcentaje1.setToolTipText("Ingrese el Porcenteja de la Nota 1");
		porcentaje1.setBounds(127, 61, 36, 20);
		getContentPane().add(porcentaje1);
		porcentaje1.setColumns(10);

		porcentaje2 = new JTextField();
		porcentaje2.setText("0");
		porcentaje2.setColumns(10);
		porcentaje2.setBounds(181, 61, 36, 20);
		getContentPane().add(porcentaje2);

		porcentaje3 = new JTextField();
		porcentaje3.setText("0");
		porcentaje3.setColumns(10);
		porcentaje3.setBounds(238, 61, 36, 20);
		getContentPane().add(porcentaje3);

		porcentaje4 = new JTextField();
		porcentaje4.setText("0");
		porcentaje4.setColumns(10);
		porcentaje4.setBounds(294, 61, 36, 20);
		getContentPane().add(porcentaje4);

		porcentaje5 = new JTextField();
		porcentaje5.setText("0");
		porcentaje5.setColumns(10);
		porcentaje5.setBounds(350, 61, 36, 20);
		getContentPane().add(porcentaje5);

		porcentaje6 = new JTextField();
		porcentaje6.setText("0");
		porcentaje6.setColumns(10);
		porcentaje6.setBounds(406, 61, 36, 20);
		getContentPane().add(porcentaje6);

		valornota1 = new JTextField();
		valornota1.setText("0");
		valornota1.setColumns(10);
		valornota1.setBounds(127, 102, 36, 20);
		getContentPane().add(valornota1);

		valornota2 = new JTextField();
		valornota2.setText("0");
		valornota2.setColumns(10);
		valornota2.setBounds(181, 102, 36, 20);
		getContentPane().add(valornota2);

		valornota3 = new JTextField();
		valornota3.setText("0");
		valornota3.setColumns(10);
		valornota3.setBounds(238, 102, 36, 20);
		getContentPane().add(valornota3);

		valornota4 = new JTextField();
		valornota4.setText("0");
		valornota4.setColumns(10);
		valornota4.setBounds(294, 102, 36, 20);
		getContentPane().add(valornota4);

		valornota5 = new JTextField();
		valornota5.setText("0");
		valornota5.setColumns(10);
		valornota5.setBounds(350, 102, 36, 20);
		getContentPane().add(valornota5);

		valornota6 = new JTextField();
		valornota6.setText("0");
		valornota6.setColumns(10);
		valornota6.setBounds(406, 102, 36, 20);
		getContentPane().add(valornota6);

		JLabel lblNewLabel_6 = new JLabel("ValorPorcentaje");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(10, 66, 107, 14);
		getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("ValorNota");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(10, 107, 107, 14);
		getContentPane().add(lblNewLabel_7);

		JLabel lblEquivale = new JLabel("Equivalencias");
		lblEquivale.setForeground(new Color(255, 255, 255));
		lblEquivale.setBounds(10, 152, 91, 14);
		getContentPane().add(lblEquivale);

		JLabel lblTotalPromedio = new JLabel("Total Promedio");
		lblTotalPromedio.setForeground(new Color(255, 255, 255));
		lblTotalPromedio.setBounds(231, 207, 107, 14);
		getContentPane().add(lblTotalPromedio);

		JLabel lblPromedioNotas = new JLabel("PROMEDIO NOTAS");
		lblPromedioNotas.setForeground(new Color(255, 255, 255));
		lblPromedioNotas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPromedioNotas.setBounds(156, 11, 148, 14);
		getContentPane().add(lblPromedioNotas);

		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(14, 194, 103, 23);
		getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(this);

		equivalencia1 = new JLabel("");
		equivalencia1.setForeground(new Color(0, 255, 0));
		equivalencia1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		equivalencia1.setBackground(Color.ORANGE);
		equivalencia1.setBounds(127, 152, 46, 14);
		getContentPane().add(equivalencia1);

		equivalencia2 = new JLabel("");
		equivalencia2.setForeground(new Color(0, 255, 0));
		equivalencia2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		equivalencia2.setBackground(Color.ORANGE);
		equivalencia2.setBounds(182, 152, 46, 14);
		getContentPane().add(equivalencia2);

		equivalencia3 = new JLabel("");
		equivalencia3.setForeground(new Color(0, 255, 0));
		equivalencia3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		equivalencia3.setBackground(Color.ORANGE);
		equivalencia3.setBounds(236, 152, 46, 14);
		getContentPane().add(equivalencia3);

		equivalencia4 = new JLabel("");
		equivalencia4.setForeground(new Color(0, 255, 0));
		equivalencia4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		equivalencia4.setBackground(Color.ORANGE);
		equivalencia4.setBounds(292, 152, 46, 14);
		getContentPane().add(equivalencia4);

		equivalencia5 = new JLabel("");
		equivalencia5.setForeground(new Color(0, 255, 0));
		equivalencia5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		equivalencia5.setBackground(Color.ORANGE);
		equivalencia5.setBounds(348, 152, 46, 14);
		getContentPane().add(equivalencia5);

		equivalencia6 = new JLabel("");
		equivalencia6.setForeground(new Color(0, 255, 0));
		equivalencia6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		equivalencia6.setBackground(Color.ORANGE);
		equivalencia6.setBounds(404, 152, 46, 14);
		getContentPane().add(equivalencia6);

		lbltotal = new JLabel("");
		lbltotal.setForeground(new Color(0, 255, 0));
		lbltotal.setBackground(new Color(255, 0, 0));
		lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbltotal.setBounds(348, 203, 94, 17);
		getContentPane().add(lbltotal);

		btnlimpiar = new JButton("LIMPIAR");
		btnlimpiar.setBounds(14, 228, 103, 23);
		getContentPane().add(btnlimpiar);
		btnlimpiar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlimpiar) {
			porcentaje1.setText("0"); // hereda la clase Jframe
			porcentaje2.setText("0");
			porcentaje3.setText("0");
			porcentaje4.setText("0");
			porcentaje5.setText("0");
			porcentaje6.setText("0");
			valornota1.setText("0");
			valornota2.setText("0");
			valornota3.setText("0");
			valornota4.setText("0");
			valornota5.setText("0");
			valornota6.setText("0");
			equivalencia1.setText("0.0");
			equivalencia2.setText("0.0");
			equivalencia3.setText("0.0");
			equivalencia4.setText("0.0");
			equivalencia5.setText("0.0");
			equivalencia6.setText("0.0");
			lbltotal.setText("0.0");
		}

		if (e.getSource() == btnCalcular) {

			double sum1, sum2, sum3, sum4, sum5, sum6;

			int porce1 = Integer.parseInt(porcentaje1.getText());
			double nota1 = Double.parseDouble(valornota1.getText());
			double result1 = ((porce1 * 0.01) * nota1);
			sum1 = result1;
			equivalencia1.setText(Double.toString((double) result1));
			System.out.println(result1);

			int porce2 = Integer.parseInt(porcentaje2.getText());
			double nota2 = Double.parseDouble(valornota2.getText());
			double result2 = ((porce2 * 0.01) * nota2);
			sum2 = result2;
			equivalencia2.setText(Double.toString((double) result2));
			System.out.println(result2);

			int porce3 = Integer.parseInt(porcentaje3.getText());
			double nota3 = Double.parseDouble(valornota3.getText());
			double result3 = ((porce3 * 0.01) * nota3);
			sum3 = result3;
			equivalencia3.setText(Double.toString((double) result3));
			System.out.println(result3);

			int porce4 = Integer.parseInt(porcentaje4.getText());
			double nota4 = Double.parseDouble(valornota4.getText());
			double result4 = ((porce4 * 0.01) * nota4);
			sum4 = result4;
			equivalencia4.setText(Double.toString((double) result4));
			System.out.println(result4);

			int porce5 = Integer.parseInt(porcentaje5.getText());
			double nota5 = Double.parseDouble(valornota5.getText());
			double result5 = ((porce5 * 0.01) * nota5);
			sum5 = result5;
			equivalencia5.setText(Double.toString((double) result5));
			System.out.println(result5);

			int porce6 = Integer.parseInt(porcentaje6.getText());
			double nota6 = Double.parseDouble(valornota6.getText());
			double result6 = ((porce6 * 0.01) * nota6);
			sum6 = result6;
			equivalencia6.setText(Double.toString((double) result6));
			System.out.println(result6);

			double total = sum1 + sum2 + sum3 + sum4 + sum5 + sum6;
			lbltotal.setText(Double.toString((double) total));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfaz formulario1 = new Interfaz();
		formulario1.setBounds(450, 100, 480, 300); // posicion 10,20 y tamaño 400
													// , 300
		formulario1.setVisible(true); // mostrar o no el frame
		formulario1.setResizable(false); // no permite modificar el tamaño

	}

}
