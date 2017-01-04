class Customer {

private int customerId;
//use static variable
private static int counter = 1000;
/*public void setCustomerId(int customerId){
this.customerId = customerId;

}*
//set class constructor
public Customer(){
this.customerId = 1008;
}
//parameterize this constructor
public Customer(int customerId){
this.customerId = customerId;
}*/

//use a static method
public static int displayCounter(){
 return (counter-2);
}


//used for static variable 
public Customer(){
  this.customerId = ++counter;
}

//another static method
public static int getTotalCustomer(){
   return(counter-1000);
}
public int getCustomerId(){
  return customerId;
}

}

//carrier class with 'main' method
class TestClass {

public static void main(String[] args){

/*Customer custObj = new Customer();
//custObj.setCustomerId(1001);// removed bcos of constructor
Customer john = new Customer();
System.out.println("John's ID is: "+john.getCustomerId());
Customer jane = new Customer(1009);
System.out.println("Jane's ID is: "+jane.getCustomerId());*/
//because of static variable
Customer c1 = new Customer();
System.out.println("First customer's ID: "+c1.getCustomerId());
Customer c2 = new Customer();
System.out.println("Second customer's ID: "+c2.getCustomerId());
System.out.println("Number of customers: "+Customer.getTotalCustomer());
System.out.println("And here's what we began with: "+Customer.displayCounter());
}

}
