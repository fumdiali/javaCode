import java.io.Console;

public class Word_proto_game {

public static void main(String[] args){

	Console console = System.console();
	String name = console.readLine("Enter your name: ");
	String pastTenseVerb = console.readLine("Enter a past-tense verb: ");
	String lang = console.readLine("Enter a programming language name: ");
	console.printf("%s really %s working with %s!",name,pastTenseVerb,lang);


}




}
