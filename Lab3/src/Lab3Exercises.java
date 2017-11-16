import javax.swing.JFrame;
public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Maria Alejandra Marrero Ortiz");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setSize(250, 200);
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
	}
}
