package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mascotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mascotas frame = new mascotas();
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
	public mascotas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnPerro = new JButton("");
		btnPerro.setIcon(new ImageIcon(mascotas.class.getResource("/imagenes/dog.png")));
		btnPerro.setBounds(25, 103, 80, 80);
		contentPane.add(btnPerro);
		
		JButton btnLoro = new JButton("");
		btnLoro.setIcon(new ImageIcon(mascotas.class.getResource("/imagenes/parrot.png")));
		btnLoro.setBounds(25, 194, 80, 80);
		contentPane.add(btnLoro);
		
		JTextArea txtADesc = new JTextArea();
		txtADesc.setLineWrap(true);
		txtADesc.setBounds(154, 11, 270, 263);
		contentPane.add(txtADesc);
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mascota gato=new mascota();
				gato.setDieta("Un gato mantiene una dieta equilibrada cuando sus fuentes de alimento \nle proveen de todos los nutrientes que necesita en sus correctas proporciones, según su estado fisiológico, \nactividad física y edad. Mientras que en sus primeros días los gatos se alimentan de leche materna, \ncuando al mes comienzan a destetarse su organismo sufre cambios que le permiten digerir alimento. ");
				txtADesc.setText(gato.getDieta());
			}
		});
		btnNewButton.setIcon(new ImageIcon(mascotas.class.getResource("/imagenes/cat.png")));
		btnNewButton.setBounds(25, 11, 80, 80);
		contentPane.add(btnNewButton);
	}
}
