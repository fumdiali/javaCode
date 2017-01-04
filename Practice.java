import java.util.*;
//import java.util.function.Consumer;

public class Practice {

public static void main(String[] args) {
 
System.out.println("Hello, "+ System.getProperty("user.name")+"!");

//start 1st loop
for(int x=1;x<=10;x++){
if(x == 5){
System.out.println("Half-way there..at 5..");

}else if(x == 10){

System.out.println("Finished!");
}else{System.out.println("Check "+x+"!");}

}//end of 1st loop


System.out.println("Next up..");
//new loop
for(int i=1;i<=5;i++){
  for(int j=1;j<=i;j++){
  System.out.println(" ** ");
}
System.out.println(i+" Row(s)..");
}//end of new loop


//a simple 'FOR' loop
List<Integer> values = Arrays.asList(1,2,3,4,5,6);

//using external iterator from java 5? 
//for(int e : values){
//System.out.println("That's "+e);

//lambda expression from java8?
values.forEach((Integer value) -> System.out.println("Check "+value));
//values.forEach((value)->System.out.println("This is "+value));
//we can remove the parenths round 'value'above for single arguments

//pass through version 
//values.forEach(System.out::println);
//}//end simple FOR
}


}
