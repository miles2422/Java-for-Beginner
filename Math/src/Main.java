import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Integer.parseInt(JOptionPane.showInputDialog("Enter Value of x"));
		double y = Integer.parseInt(JOptionPane.showInputDialog("Enter Value of x"));
		double z = Math.sqrt((x*x) + (y*y));
		JOptionPane.showMessageDialog(null, z);
		//double z = Math.abs(y);
		//double z = Math.sqrt(y);
		//double z = Math.round(x);
		//double z = Math.ceil(x); // round up
		//double z = Math.floor(x); // round down
		
		  
		
	}

}
