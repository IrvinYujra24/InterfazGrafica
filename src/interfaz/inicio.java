package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tbxA;
	private JTextField tbxB;
	private JTextField tbxResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERACIONES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(179, 11, 108, 14);
		contentPane.add(lblNewLabel);
		
		tbxA = new JTextField();
		tbxA.setBounds(74, 43, 86, 20);
		contentPane.add(tbxA);
		tbxA.setColumns(10);
		
		tbxB = new JTextField();
		tbxB.setBounds(74, 74, 86, 20);
		contentPane.add(tbxB);
		tbxB.setColumns(10);
		
		tbxResultado = new JTextField();
		tbxResultado.setBounds(74, 105, 86, 20);
		contentPane.add(tbxResultado);
		tbxResultado.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setBounds(10, 49, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("B");
		lblNewLabel_2.setBounds(10, 80, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(10, 111, 59, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int a=Integer.parseInt(tbxA.getText());
					int b=Integer.parseInt(tbxB.getText());
					tbxResultado.setText((operacion(a, b, "+")+""));
					/*int r=a+b;
					tbxResultado.setText(r+"");*/
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					tbxResultado.setText("Debe colocar un valor numérico");
				}
			}
		});
		btnSuma.setBounds(179, 42, 46, 23);
		contentPane.add(btnSuma);
		
		JButton btnProducto = new JButton("*");
		btnProducto.setBounds(179, 73, 46, 23);
		contentPane.add(btnProducto);
		
		JButton btnResta = new JButton("-");
		btnResta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int a=Integer.parseInt(tbxA.getText());
					int b=Integer.parseInt(tbxB.getText());
					tbxResultado.setText((operacion(a, b, "-")+""));					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					tbxResultado.setText("Debe colocar un valor numérico");
				}
			}
		});
		btnResta.setBounds(241, 42, 46, 23);
		contentPane.add(btnResta);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(241, 73, 46, 23);
		contentPane.add(btnDivision);
		
		JButton btnModulo = new JButton("%");
		btnModulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operacion op=new operacion();
				/*op.setValorA(Integer.parseInt(tbxA.getText()));
				op.setValorB(Integer.parseInt(tbxB.getText()));*/
				//tbxResultado.setText(op.modulo()+"");
				int a=Integer.parseInt(tbxA.getText());
				int b=Integer.parseInt(tbxB.getText());
				op.modulo(a,b);
				tbxResultado.setText(op.getResultado()+"");
			}
		});
		btnModulo.setBounds(179, 104, 46, 23);
		contentPane.add(btnModulo);
		
		JButton btnModulo_1 = new JButton("++");
		btnModulo_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operacion op=new operacion();
				op.setValorA(Integer.parseInt(tbxA.getText()));
				tbxResultado.setText(op.suma_plus());
			}
		});
		btnModulo_1.setBounds(365, 42, 59, 23);
		contentPane.add(btnModulo_1);
	}
	public static int operacion(int a, int b, String opcion) {
		int resultado=0;
		switch (opcion) {
		case "+": {
			resultado=a+b;
			return resultado;
		}
		case "-": {
			resultado=a-b;
			return resultado;
		}
		case "*": {
			resultado=a*b;
			return resultado;
		}
		case "/": {
			resultado=a/b;
			return resultado;
		}
	}
		return resultado;
}}
