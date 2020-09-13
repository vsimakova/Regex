
/**
 * Write a description of class Regex here.
 * 
 * @author Viktoryia Simakova
 * @version 30 April 2020
 */
public class Regex
{
    public static void main(String[] args){
        System.out.println(firstName("Viktoryia"));
        System.out.println(phoneNumber("(206)476-9999"));
    }

    public static boolean firstName(String name){
        return name.matches("[A-Z][a-z]*");
    }

    public static boolean phoneNumber(String number){
        return number.matches("^\\(?(\\d{3})\\)?[-.\\s]?(\\d{3})[-.\\s]?(\\d{4})$");
    }
    
}
