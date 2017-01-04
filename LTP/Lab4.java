//my solution came close but worked only after peeking answer
import java.util.*;

public class Lab4 {

   public static void main(String[] args) {
   int riderHeight = 1;
   Scanner sc = new Scanner(System.in);
  

    while(riderHeight !=0) {
    System.out.println("Enter your Height,in INCHES(Type '0' to quit):");
    riderHeight = sc.nextInt();

      if(riderHeight == 0){
          System.out.println("Goodbye!");
         }
       else if(riderHeight<60){ 
          System.out.println("Too short!");
         }

        else if(riderHeight > 78){ 
          System.out.println("Too tall!Can't ride!");
         }
         else{
          System.out.println("You can ride..");
         
          }
                                  }   
   }


}
