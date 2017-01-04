public class Sim1{


  public static void main(String[] sim){


     String fname = "chukwufumnanya";
     String name = fname.substring(0,6).toUpperCase()+fname.substring(6).toLowerCase();
     System.out.println("Hello,"+name);
     System.out.println("Your name is "+name.length()+" xters long!");
     System.out.println("Would you mind if i called you "+fname.replace('a','e').substring(6).toUpperCase()+"?");
     System.out.println("Or just "+name.replace('u','*').substring(0,1).toUpperCase()+"?");
   }


}
