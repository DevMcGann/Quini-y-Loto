import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setTitle("Juega Quini y Loto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 407);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJuegaQuini = new JButton("Juega Quini");
		btnJuegaQuini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		         fquini verfquini=new fquini(); 
		         //línea 2-hacemos visible el formulario que queremos llamar 
		         verfquini.setVisible(true); 
		         principal.this.setVisible(false);
				
			}
		});
		btnJuegaQuini.setBounds(175, 25, 136, 50);
		contentPane.add(btnJuegaQuini);
		
		JButton btnJuegaLoto = new JButton("Juega Loto");
		btnJuegaLoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				floto verfloto=new floto(); 
		         //línea 2-hacemos visible el formulario que queremos llamar 
		         verfloto.setVisible(true); 
		         principal.this.setVisible(false);
			}
		});
		btnJuegaLoto.setBounds(175, 306, 136, 52);
		contentPane.add(btnJuegaLoto);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(principal.class.getResource("/Imagenes/quini6.png")));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(61, 67, 339, 129);
		contentPane.add(label);
		
		JLabel lbloto = new JLabel("");
		lbloto.setHorizontalAlignment(SwingConstants.CENTER);
		//lbloto.setIcon(new ImageIcon(principal.class.getResource("/Imagenes/loto.jpg")));
		lbloto.setBounds(93, 198, 276, 97);
		contentPane.add(lbloto);
		ImageIcon fot = new ImageIcon(principal.class.getResource("/Imagenes/loto.jpg"));
		Icon iconoloto = new ImageIcon(fot.getImage().getScaledInstance(lbloto.getWidth(), lbloto.getHeight(), Image.SCALE_DEFAULT));
		lbloto.setIcon(iconoloto);
		
		JButton btautor = new JButton("???");
		btautor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Programado por: Gabriel Mc Gann");
			}
		});
		btautor.setBounds(10, 11, 47, 23);
		contentPane.add(btautor);
		this.repaint();
	}
}
