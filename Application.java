class Brain{

private Brain brain;

public Brain(){
System.out.println("Thinking..");
}

}

class Person{

private String name;

public Person(){

}

public Person(String name){
Brain brain = new Brain();
this.name = name;
}
public void writeName(){
System.out.println("My name is "+name);
}

public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}
}

public class Application{

public static void main(String[] args){

System.out.println("Hello,world");

Person p = new Person("Chukwufumnanya");
String name = p.getName();
name = name+ " Diali";
p.setName(name);
p.writeName();
}

}
