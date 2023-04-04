package bootcamp.M4.Team1_Juego_del_ahorcado;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AhorcadoMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnNY, btnO,
			btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;

	public AhorcadoMain() {
		setTitle("Juego del ahorcado!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 299, 147);
		contentPane.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 169, 299, 177);
		contentPane.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 357, 299, 315);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(10, 71, 279, 214);
		panel_3.add(panel);
		panel.setLayout(new MigLayout("", "[53px][51px][53px][49px][51px]", "[23px][23px][23px][23px][23px][23px]"));

		btnA = new JButton("A");
		btnA.addActionListener(this);
		panel.add(btnA, "cell 0 0,growx,aligny center");

		btnB = new JButton("B");
		btnB.addActionListener(this);
		panel.add(btnB, "cell 1 0,growx,aligny center");

		btnC = new JButton("C");
		btnC.addActionListener(this);
		panel.add(btnC, "cell 2 0,growx,aligny center");

		btnD = new JButton("D");
		btnD.addActionListener(this);
		panel.add(btnD, "cell 3 0,growx,aligny center");

		btnE = new JButton("E");
		btnE.addActionListener(this);
		panel.add(btnE, "cell 4 0,growx,aligny center");

		btnF = new JButton("F");
		btnF.addActionListener(this);
		panel.add(btnF, "cell 0 1,growx,aligny center");

		btnG = new JButton("G");
		btnG.addActionListener(this);
		panel.add(btnG, "cell 1 1,growx,aligny center");

		btnH = new JButton("H");
		btnF.addActionListener(this);
		panel.add(btnH, "cell 2 1,growx,aligny center");

		btnI = new JButton("I");
		btnI.addActionListener(this);
		panel.add(btnI, "cell 3 1,growx,aligny center");

		btnJ = new JButton("J");
		btnJ.addActionListener(this);
		panel.add(btnJ, "cell 4 1,growx,aligny center");

		btnK = new JButton("K");
		btnK.addActionListener(this);
		panel.add(btnK, "cell 0 2,growx,aligny center");

		btnL = new JButton("L");
		btnL.addActionListener(this);
		panel.add(btnL, "cell 1 2,growx,aligny center");

		btnM = new JButton("M");
		btnM.addActionListener(this);
		panel.add(btnM, "cell 2 2,growx,aligny center");

		btnN = new JButton("N");
		btnN.addActionListener(this);
		panel.add(btnN, "cell 3 2,growx,aligny center");

		btnNY = new JButton("Ñ");
		btnNY.addActionListener(this);
		panel.add(btnNY, "cell 4 2,growx,aligny center");

		btnO = new JButton("O");
		btnO.addActionListener(this);
		panel.add(btnO, "cell 0 3,growx,aligny center");

		btnP = new JButton("P");
		btnP.addActionListener(this);
		panel.add(btnP, "cell 1 3,growx,aligny center");

		btnQ = new JButton("Q");
		btnQ.addActionListener(this);
		panel.add(btnQ, "cell 2 3,growx,aligny center");

		btnR = new JButton("R");
		btnR.addActionListener(this);
		panel.add(btnR, "cell 3 3,growx,aligny center");

		btnS = new JButton("S");
		btnS.addActionListener(this);
		panel.add(btnS, "cell 4 3,growx,aligny center");

		btnT = new JButton("T");
		btnT.addActionListener(this);
		panel.add(btnT, "cell 0 4,growx,aligny center");

		btnU = new JButton("U");
		btnU.addActionListener(this);
		panel.add(btnU, "cell 1 4,growx,aligny center");

		btnV = new JButton("V");
		btnV.addActionListener(this);
		panel.add(btnV, "cell 2 4,growx,aligny center");

		btnW = new JButton("W");
		btnW.addActionListener(this);
		panel.add(btnW, "cell 3 4,growx,aligny center");

		btnX = new JButton("X");
		btnX.addActionListener(this);
		panel.add(btnX, "cell 4 4,growx,aligny center");

		btnY = new JButton("Y");
		btnY.addActionListener(this);
		panel.add(btnY, "cell 0 5,growx,aligny center");

		btnZ = new JButton("Z");
		btnZ.addActionListener(this);
		panel.add(btnZ, "cell 1 5,growx,aligny center");

		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Teclado");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel.setBounds(20, 38, 92, 22);
		panel_3.add(lblNewJgoodiesLabel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnA) {

		}
		if (e.getSource() == btnB) {

		}

	}
}
