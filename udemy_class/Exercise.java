import javax.swing.JOptionPane;

public class Exercise {

	public static void main(String[] args) {

	int adults,children,totalPrice;

	adults = Integer.parseInt(JOptionPane.showInputDialog("Number of Adults: "));
	children = Integer.parseInt(JOptionPane.showInputDialog("Number of Children: "));

	totalPrice = (11*adults) + (6*children);

	System.out.println("Thank you. Your total bill is N"+totalPrice);


}


}
