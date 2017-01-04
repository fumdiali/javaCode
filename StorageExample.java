import java.io.*;
import java.util.Scanner;

public class StorageExample {

  public static void main(String[] args){

    Scanner grab = new Scanner(System.in);

    System.out.println("Enter your full name:");
    String name = grab.nextLine();
    System.out.println("Enter your email:");
    String email = grab.nextLine();
    //System.out.println("Enter your location(e.g.Lagos,NG):");
    //String addy = grab.nextLine();
    String formname = name.replaceAll(" ","")+".txt";

    try {
        PrintWriter saver = new PrintWriter(formname);
        
        saver.println("Name:"+name);
        saver.println("Email:"+email);
        //saver.println("Name:"+name);
        saver.close();
}
catch(FileNotFoundException e) {
    System.out.println("Ooops!It didn't work!");

}
    System.out.println(name+"|"+email+" > has been saved in "+name+".txt");

}

}
