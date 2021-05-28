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
     setBounds(700, 500, 150, 100); // 버튼 위치 x,y, 가로,세로

  bt_AnotherGame = new JButton("RESET");
  bt_AnotherGame.setFont(new Font("INK FREE", 0, 30));
  //bt_AnotherGame.setBounds(0, 500, 100, 100); 바꿔도 변화가 없음 ???
  bt_AnotherGame.addActionListener(this);

  add(bt_AnotherGame);
  setVisible(true);
  
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==bt_AnotherGame) {
	  this.setVisible(false);
      this.dispose(); //해당프레임만종료
      new LevelFrame(); //새게임
  }
 }
}