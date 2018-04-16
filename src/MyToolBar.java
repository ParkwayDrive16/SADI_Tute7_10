import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class MyToolBar extends JToolBar{
	JLabel[] labelArr = new JLabel[6];
	
	MyToolBar(){
		loadImgaesIntoArray("images/circle_blue.png", "images/circle_green.png","images/circle_orange.png",
				"images/circle_red.png", "images/circle_yellow.png");
		add(labelArr[0]);
		add(labelArr[1]);
		add(labelArr[2]);
		add(labelArr[3]);
		add(labelArr[4]);

		setVisible(true);
	}
	
	private JLabel[] loadImgaesIntoArray(String...arguments) {
		for (int i = 0; i < arguments.length; i++) {
			ImageIcon image = new ImageIcon(arguments[i]);
			JLabel imagelabel = new JLabel(image);
			labelArr[i] = imagelabel;
		}
		return labelArr;
	}

}
