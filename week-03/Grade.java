import java.util.Scanner;

/**
 * Write a description of class Grade here.
 *
 * @author Purnima
 * @version v2
 */
public class Grade
{
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Ask for his/her grade:");
    int g = input.nextInt();
    String isValid =(g>=40)?"Pass":"Fail";
    System.out.println(isValid);
    
    }
}