package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
public void greet(){
List<String> Greetings = new ArrayList<>();
Greetings.add("Hello");

for(String greet:Greetings){
System.out.println("Greeting:" + greet);
}
}

public int countWords(String words)
{
String[] separateWords = StringUtils.split(words,' ');
return (separateWords==null)? 0 : separateWords.length;
}

public Application() {
System.out.println("Inside Application");
}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	int count = app.countWords("Hi how are you doing?");
	System.out.println("Number of words:" + count);
    }
}