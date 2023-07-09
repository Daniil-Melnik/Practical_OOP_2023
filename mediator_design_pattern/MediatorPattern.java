package mediator_design_pattern;

import java.util.Date;

class Chat { 
public static void showMessage(User user, String message) { 
    System.out.println(new Date().toString() + "[" + user.getName() + "]: " + message); 
    } 
} 

class User { 
    private String name; 
    public User(String name) { 
        this.name = name; 
    } 
 
    public String getName() { 
        return name; 
    } 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    public void sendMessage(String message) { 
        Chat.showMessage(this, message); 
    } 
 } 

public class MediatorPattern {
    public static void main(String[] args) { 
        User david = new User("David"); 
        User scott = new User("Scott"); 
        
        david.sendMessage("Hi Scott! How are you?"); 
        scott.sendMessage("I'm great! Thanks for asking. How are you?"); 
    } 
}
