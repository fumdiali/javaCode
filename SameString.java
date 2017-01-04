public class SameString {

public static void main(String[] args){

String myString = "Tom Jones";
String urString = new String("Tom Jones");

//boolean areStrings = myString.equals(urString);

 if(myString == urString){

System.out.println("Equal");
}else{
System.out.println("Not Equal");
}

//System.out.println(areStrings); //should print TRUE

}

}
