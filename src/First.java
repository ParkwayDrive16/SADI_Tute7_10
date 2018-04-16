import java.awt.*;

import javax.swing.*;

public class First extends JFrame{
	
	First(){
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,600,600);
		setLayout(new BorderLayout());
		
		MyToolBar toolbar = new MyToolBar();
		add(toolbar, BorderLayout.NORTH);
		
		CenterPanel centerPanel = new CenterPanel();
		add(centerPanel, BorderLayout.CENTER);
		
		StatusBar statusBar = new StatusBar();
		add(statusBar, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		First f = new First();

	}

}
