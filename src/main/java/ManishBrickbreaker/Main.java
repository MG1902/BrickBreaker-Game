package ManishBrickbreaker;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Main extends JFrame implements KeyListener, ActionListener 
{
	static JFrame obj;
	JFrame a = new JFrame();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private int x = screenSize.width;
	private int y = screenSize.height;
	static JButton b1 = new JButton("EASY ");
	static JButton b2 = new JButton("MEDIUM");
	static JButton b3 = new JButton("HARD");
	static JLabel label1 = new JLabel("BRICK BREAKER");
	static JLabel label2 = new JLabel("--> Use left and right keys to move the paddle");
	static JLabel label3 = new JLabel("--> Break the green brick to get power up");
	static JLabel label4 = new JLabel("--> Break all the bricks to win the game");
	static JLabel label5 = new JLabel("SELECT DIFFICULTY LEVEL:");
	public Main() {
		getContentPane().setBackground(Color.BLACK);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b1.setBounds(50,500, 200, 100);
		b1.addActionListener(this);
		b1.setFont(new Font("cooper black",Font.BOLD,30));
		b2.addActionListener(this);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b2.setBounds(300, 500, 200, 100);
		b2.setFont(new Font("cooper black",Font.BOLD,30));
		b2.addActionListener(this);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b3.setFont(new Font("cooper black",Font.BOLD,30));
		b3.setBounds(550, 500, 200, 100);
		b3.addActionListener(this);
		label1.setForeground(Color.orange);
		label1.setFont(new Font("forte",Font.BOLD, 100));
		label1.setBounds(250,10, 2000, 100);
		label2.setForeground(Color.GREEN);
		label2.setFont(new Font("ITALIC",Font.BOLD,24));
		label2.setBounds(50,150, 2000, 100);
		label3.setForeground(Color.GREEN);
		label3.setFont(new Font("italic",Font.BOLD,24));
		label3.setBounds(50,200, 2000, 100);
		label4.setForeground(Color.GREEN);
		label4.setFont(new Font("ITALIC",Font.BOLD,24));
		label4.setBounds(50,250, 2000, 100);
		label5.setForeground(Color.RED);
		label5.setFont(new Font("COOPER BLACK",Font.BOLD,30));
		label5.setBounds(50,400, 2000, 100);
	}
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 int x = screenSize.width;
		 int y = screenSize.height;
		obj = new Main();
		obj.setBackground(Color.BLACK);
		obj.setBounds(100,100,x,y);
		obj.setTitle("Brick Breaker!!");		
		obj.setResizable(true);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.getContentPane().setLayout(null);
		obj.getContentPane().add(label1);
		obj.getContentPane().add(label2);
		obj.getContentPane().add(label3);
		obj.getContentPane().add(label4);
		obj.getContentPane().add(label5);
		obj.getContentPane().add(b1);
		obj.getContentPane().add(b2);
		obj.getContentPane().add(b3);
	}


	public void actionPerformed(ActionEvent e) {
		this.obj.dispose();
		a = new JFrame();
		JButton c = (JButton) e.getSource();
		if(c.getText().equals("EASY ")) {
			Gameplay1 g = new Gameplay1(5,12,1,this);
			this.a.setBounds(100,100,this.x,this.y);
			this.a.setTitle("Brick Breaker");		
			this.a.setResizable(true);
			this.a.setVisible(true);
			this.a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.a.getContentPane().add(g);
		}
		else if(c.getText().equals("MEDIUM")) {

			//JFrame a = new JFrame();
			Gameplay2 g = new Gameplay2(6,12,-500,this);
			this.a.setBounds(100, 100, this.x, this.y);
			this.a.setTitle("Breakout Ball");		
			this.a.setResizable(true);
			this.a.setVisible(true);
			this.a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.a.getContentPane().add(g);
		}
		else if(c.getText().equals("HARD")) {
			//JFrame a = new JFrame();
			Gameplay3 g = new Gameplay3(5,12,5,this);
			this.a.setBounds(100, 100, this.x, this.y);
			this.a.setTitle("Breakout Ball");		
			this.a.setResizable(true);
			this.a.setVisible(true);
			this.a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.a.getContentPane().add(g);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			a.dispose();
			obj.setVisible(true);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
