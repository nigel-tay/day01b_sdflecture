package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Console con = System.console();
        List<String> todos = new ArrayList<>(); // Unlike Arrays, lists can store as many items as you want
        String input = "";

        while (!input.equals("quit")) {
            input = con.readLine("Enter a new todo: ");
            if (!input.equals("quit")) {
                todos.add(input);
            }
        }
        
        for (String todo: todos) {
            System.out.println("Todo task: " + todo);
        }
    }
}
