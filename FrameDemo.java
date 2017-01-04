import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FrameDemo{
  public static void main(String[] args){

	JFrame myFrame = new JFrame("First Sample Game");
	myFrame.setSize(400,500);
	myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	myFrame.setVisible(true);

}

}
