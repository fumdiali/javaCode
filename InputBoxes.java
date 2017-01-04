//package name here
import javax.swing.*;

public class InputBoxes {

	public static void main(String[] args) {

		String first_name = JOptionPane.showInputDialog("First Name","Enter your first name");
		String last_name = JOptionPane.showInputDialog("Last Name","Enter your family name");
		String age = JOptionPane.showInputDialog("Enter your age");
		int your_age = Integer.parseInt(age);

		String name = "Hello,"+first_name+" "+last_name+"!You are "+your_age+"years old!";

		JOptionPane.showMessageDialog(null,name,"Name",JOptionPane.WARNING_MESSAGE);

		//clean up after us
		System.exit(0);
}

}

