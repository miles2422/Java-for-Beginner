import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
		JOptionPane.showMessageDialog(null, "Hello " + name + "\nYour age is " + age);
		System.out.println(name);
	}
}
