package application;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GameFrame2 extends JFrame implements ActionListener{

 JButton bt_AnotherGame;

 GameFrame2(){
	 setTitle("RESET");

     setUndecorated(true);
    setResizable(false);
    //setLayout(null);
     setBounds(700, 500, 150, 100); // ��ư ��ġ x,y, ����,����

  bt_AnotherGame = new JButton("RESET");
  bt_AnotherGame.setFont(new Font("INK FREE", 0, 30));
  //bt_AnotherGame.setBounds(0, 500, 100, 100); �ٲ㵵 ��ȭ�� ���� ???
  bt_AnotherGame.addActionListener(this);

  add(bt_AnotherGame);
  setVisible(true);
  
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==bt_AnotherGame) {
	  this.setVisible(false);
      this.dispose(); //�ش������Ӹ�����
      new LevelFrame(); //������
  }
 }
}