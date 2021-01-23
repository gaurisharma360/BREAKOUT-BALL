package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj=new JFrame();//Window
		Gameplay gameplay=new Gameplay();//Panel inside the window
		//Window Settings
		obj.setBounds(10,10,700,600);
		obj.setTitle("BreakoutBall");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);//adding gameplay panel into window
		
	}

}
