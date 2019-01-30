import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Gui extends JFrame {

	private JTextField tf;
	private JButton b1;

	public Gui() {
		super("Welcome");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Enter text here", 20);
		add(tf);

		b1 = new JButton("click");
		add(b1);

		Handler thehandler = new Handler();
		tf.addActionListener(thehandler);
		b1.addActionListener(thehandler);
		
		setVisible(true);
		setSize(400, 400);
	}

	private class Handler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == b1) {
				JOptionPane.showMessageDialog(null, "Welcome Lad");
			}
		}
	}
	
	public static void main(String[] args) {
		Gui rn = new Gui();
	}
}
