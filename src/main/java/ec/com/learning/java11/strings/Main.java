package ec.com.learning.java11.strings;

import java.util.stream.Collectors;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public void isBlank(String text){
        System.out.println(text.isBlank());
    }
    
    public void repeat(String text, int value){
        var repetition = text.repeat(value);
        System.out.println(repetition);
    }
    
    public void toList(String text){
        System.out.println(text.lines().collect(Collectors.toList()));
    }
    
    public void removeSpaces(String text){
        // At the init and at the end
        System.out.println(text.strip());
        System.out.println(text.stripLeading());
        System.out.println(text.stripTrailing());
        System.out.println(text.trim());
    }
    
    public static void main(String[] args) {
        Main app = new Main();
        app.isBlank("THIS IS A TEST OF STRING METHODS");
        app.repeat("Steven", 5);
        app.toList("1,2,3,4,5,6");
        app.removeSpaces(" THIS IS A TEST OF STRING METHODS ");
        
    }
    
}
