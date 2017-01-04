//simple prog to verify user name and age for access
import java.util.Scanner;

public class UserInput{

public static void main(String[] args){

System.out.println("Enter your name:");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
System.out.println("Hello,"+name);
System.out.println("Enter the pass-phrase 'SESAME' for confirmation:");
String passph = sc.nextLine();
if(!passph.startsWith("SA",2)){
System.out.println("The code isn't correct.Check your caps lock..");
}else{
System.out.println("Verified..proceed..");
}
System.out.println("Enter your age: ");
int age = sc.nextInt();

//ternary operation
String result = age < 18 ? "Sorry,"+name+".Access denied!": "You may proceed..";
System.out.println(result);
}
}
