import java.util.Scanner;

public class LTP_lab1 {

    public static void main(String[] starboi) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
            name = sc.nextLine();
            System.out.println("Your name is "+name+"!");
            System.out.println(name+",you love writing code!");
        System.out.println("--------------------------------");
        System.out.println("Now let's calculate the area of a rect..");
        System.out.println("Enter length of side 'A':");
        float sideA = sc.nextFloat();
        System.out.println("Enter length of side 'B':");
        float sideB = sc.nextFloat();

        float area = sideA*sideB;

        System.out.println("The area of your rectangle is:"+area);

       // System.out.println("That will be all for now!");
        System.out.println("*******************************");

        System.out.println("Now, how old are you?");
        int age = sc.nextInt();
        System.out.println("Really,"+name+"?Are you sure that you are "+age+"?");
}


}
