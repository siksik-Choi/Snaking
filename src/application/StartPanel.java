package application;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JFrame implements ActionListener {

	JButton startButton = new JButton();
	
	public StartPanel() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		//getContentPane().setBackground(Color.orange); -> �Ƹ� �гο� ������ �ȳ���..
		setResizable(false);
		setLocationRelativeTo(null); // ������ġ�� ��ġ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//snaking ���� ���� = Title
		JPanel StartPanel = new JPanel();
		StartPanel.setBackground(Color.orange);
		StartPanel.setLayout(null);
		JLabel Title = new JLabel();
		ImageIcon titleIcon = new ImageIcon("src/image/StartTitle.png");
		Title.setIcon(titleIcon);
		Title.setBounds(40,20,400,160);			// s,
		StartPanel.add(Title);
		
		//�� �׸� ����
		JLabel snake_pic = new JLabel();
		ImageIcon main_Icon = new ImageIcon("src/image/snake.png");
		snake_pic.setIcon(main_Icon);
		snake_pic.setBounds(130,200,225,225);
		StartPanel.add(snake_pic);

		

		// ���� ȭ�� �����ư ����
		ImageIcon normalIcon = new ImageIcon("src/image/startbutton2.png");
		ImageIcon rolloverIcon = new ImageIcon("src/image/startbutton.png");
		ImageIcon pressedIcon = new ImageIcon("src/image/startbutton2.png");
		
		startButton.setIcon(normalIcon); // �Ϲ����� ����
		startButton.setRolloverIcon(rolloverIcon);
		startButton.setPressedIcon(pressedIcon);
		startButton.setBounds(150,440,160,160); // ��ư�� ��ġ
		startButton.addActionListener(this);
		startButton.setBorderPainted(false);
		startButton.setFocusPainted(false);
		startButton.setContentAreaFilled(false);
		StartPanel.add(startButton);
		
		add(StartPanel);
	
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==startButton) {
			  this.setVisible(false);
		      this.dispose(); //�ش������Ӹ�����
		      new LevelFrame(); // LevelFrame���� �Ѿ!
		  }
	}
	
}
