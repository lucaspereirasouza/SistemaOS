package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;

public class Sobre extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/AboutIcon.png")));
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 495, 350);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 261);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(307, 61, 145, 117);
		contentPanel.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/ConsoleIcon.png")));
		
		JLabel lblNewLabel_3 = new JLabel("Sob licença MIT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(148, 108, 126, 60);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Feito por:");
		lblNewLabel_1_1.setFont(new Font("Square721 BT", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(10, 229, 126, 46);
		contentPanel.add(lblNewLabel_1_1);
		
		JTextArea txtrEsseAplicativoTem = new JTextArea();
		txtrEsseAplicativoTem.setFont(new Font("MS Gothic", Font.BOLD, 13));
		txtrEsseAplicativoTem.setBackground(new Color(240, 240, 240));
		txtrEsseAplicativoTem.setEditable(false);
		txtrEsseAplicativoTem.setText("Este aplicativo tem função de formar \r\nordens de serviços e cadastro do usuario \r\nno banco de dados do Console X.");
		txtrEsseAplicativoTem.setBounds(10, 11, 306, 54);
		contentPanel.add(txtrEsseAplicativoTem);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 76, 128, 128);
		contentPanel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit-icon.png")));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Lucas pereira");
		lblNewLabel_1_1_1.setFont(new Font("Square721 BT", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1.setBounds(10, 254, 126, 46);
		getContentPane().add(lblNewLabel_1_1_1);
	}
}
