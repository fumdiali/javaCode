import java.util.Scanner;

public class Welcome {

public static void main(String[] args) {

String name; int age;

Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
name=sc.nextLine();
System.out.println("Welcome,"+name);
}


}
