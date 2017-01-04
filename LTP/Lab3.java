import java.util.Scanner;

public class Lab3 {

  public static void main(String[] args){

     int itemQty;
     String itemName;
     double itemPrice,taxRate,subTotal,taxAmt,grandTotal;


    Scanner s = new Scanner(System.in);
    System.out.println("Enter item:");
    itemName = s.nextLine();

    System.out.println("Enter the quantity:");
    itemQty = s.nextInt();

    System.out.println("Enter the unit price:");
    itemPrice = s.nextDouble();

    System.out.println("What is the Tax Rate?(0.6,1.2..etc )");
    taxRate = s.nextDouble();

    subTotal = itemPrice * itemQty;
    taxAmt = subTotal * taxRate;
    grandTotal = subTotal + taxAmt;


    System.out.println("You selected "+itemQty+" "+itemName+"(s),which cost "+itemPrice+" each.");
    System.out.println("At a rate of "+taxRate+"%,your sub-total is "+subTotal+".");
    System.out.println("You will be taxed "+taxAmt+".PAY NOW: "+grandTotal+"!");
    }



}
