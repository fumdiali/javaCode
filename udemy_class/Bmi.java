import java.util.*;

public class Bmi {

	public static void main(String[] args) {

	String name;
	double height,weight,bmi;

	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter your name: ");
	name = sc.nextLine();
	System.out.println("Hello,"+name+".Enter your height in meters,please.");
	height = sc.nextDouble();
	System.out.println("..and your current weight..");
	weight = sc.nextDouble();

	bmi = (weight / (height*height));

	System.out.println("Thanks,"+name+". Your BMI is "+bmi);

}

}
