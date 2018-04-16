import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel{
	StatusBar(){
		JLabel leftLabel = new JLabel("label1");
//		leftLabel.setBorder();
		add(leftLabel);
		
		JLabel centerLabel = new JLabel("label2");
		add(centerLabel); 
		
		JLabel rightLabel = new JLabel("label3");
		add(rightLabel); 
		
		setVisible(true);
	}
}
