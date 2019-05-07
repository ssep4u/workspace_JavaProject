import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(500,300);
		frame.setPreferredSize(new Dimension(300, 200));
//		frame.setSize(300, 400);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("태어난 달 : ");
//		String[] picnics = {"봄꽃구경", "여름수영"};
		JComboBox<String> cb = new JComboBox<>();
		for(int i = 1;i<=12;i++) {
			cb.addItem(i+"");	//String.valueOf(i)
		}

		panel.add(label);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}












