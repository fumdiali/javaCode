import java.util.*;

public class Calc {

public static void main(String[] args){
System.out.println("*******************");
System.out.println(" Cool Calculator ");
System.out.println("*******************");

System.out.println("Welcome to my simple calculator app.");

String uname;
double num1,num2,result;
Scanner sc = new Scanner(System.in);

System.out.println("Enter your username:");
uname = sc.nextLine();
System.out.println("Hello,"+uname+".Enter a number:");
num1 = sc.nextDouble();
System.out.println("Enter a second number:");
num2 = sc.nextDouble();
result = num1 + num2;
System.out.println("The sum of "+num1+" and "+num2+" is:"+result);
System.out.println("Thanks for playing.Goodbye "+uname+"!!");

/*System.out.println("Would you like to go again?(Y/N):");
String ans = "Great!Let's go!";
char pick = ('Y') ? ans : "Bye!";
System.out.println(pick);


/*System.out.println("Log in again? Enter 'L':");
String login = sc.nextLine();
String message = login == 'L' ? "Welcome back!" : "Wrong answer!";
System.out.println(message);*/

}
}

