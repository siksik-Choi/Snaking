import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LevelFrame extends JFrame{
	
	JPanel LevelPanel;
	JComboBox<String> levelbox;
	String level_list[] = {"Hell", "Normal", "Easy"};
	JLabel level_print;
	JButton startButton = new JButton();
	
	public LevelFrame(){
		setSize(Main.SCREEN_HEIGHT,Main.SCREEN_WIDTH);
	
		//getContentPane().setBackground(Color.orange); -> 아마 패널에 가려져 안나옴..
		setResizable(false);
		setLocationRelativeTo(null); // 절대위치로 위치조정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//LevelPanel 설정
		LevelPanel = new JPanel();
		LevelPanel.setBackground(Color.orange); // 배경색 선택
		LevelPanel.setLayout(null);
		
		//Combobox 설정
		levelbox = new JComboBox(level_list);
		level_print = new JLabel("LEVEL : CHOOSE LEVEL");
		
		levelbox.setBounds(280,180,100,40); // combobox location
		level_print.setBounds(260,220,200,35); // level_print location
		
		LevelPanel.add(levelbox);
		LevelPanel.add(level_print);
		
		
		// 다음 화면 진행버튼 삽입
		ImageIcon normalIcon = new ImageIcon("src/image/startbutton2.png");
		ImageIcon rolloverIcon = new ImageIcon("src/image/startbutton.png");
		ImageIcon pressedIcon = new ImageIcon("src/image/startbutton2.png");
		
		startButton.setIcon(normalIcon); // 일반적인 상태
		startButton.setRolloverIcon(rolloverIcon);
		startButton.setPressedIcon(pressedIcon);
		startButton.setBounds(250,260,160,160); // 버튼의 위치
		//startButton.addActionListener(this);
		startButton.setBorderPainted(false);
		startButton.setFocusPainted(false);
		startButton.setContentAreaFilled(false);
		LevelPanel.add(startButton);
		
		add(LevelPanel);
		
		levelbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fruit = levelbox.getSelectedItem().toString();
				level_print.setText("LEVEL : " + fruit);
			}
		});
		
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  if(e.getSource()==startButton) {
			//		  this.setVisible(false);
			//	      this.dispose(); //해당프레임만종료
				      new GameFrame(); // GameFrame으로 넘어감!
				  }
			}
		});
		
		
		setVisible(true);
	}
	
	
}
