import java.util.Scanner;

/**
 * Write a description of class XFXCinema here.
 *
 * @author Purnima
 * @version v1
 */
public class XFXCinema
{
    public static void main(String [] args)
    {
        double basePrice;
        Scanner input=new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^WELCOME TO XFX CINEMA^^^^^^^^^^^^^^^^^");
        System.out.println("\n");
        System.out.println("Enter the age of customer:");
        int age=input.nextInt();
        if(age<15)
        {    
        basePrice=150;
        }
        else if(age>=60)
        {
        basePrice=200;
        }
        else 
        {
        basePrice=250;
        }
        System.out.println("Is the movie in Hindi?(Y/N)");
        char h=input.next().toUpperCase().charAt(0);
        System.out.println("Is the movie in english?(Y/N)");
        char e=input.next().toUpperCase().charAt(0);
        double price;
        if(h=='Y')
        {    
        price=basePrice+50;
        }
        else if(e=='Y')
        {
        price=basePrice+100;
        }
        else 
        {
        price=basePrice;
        }
        System.out.println("Does the customer have a valid student ID?(Y/N)");
        char id=input.next().toUpperCase().charAt(0);
        double p;
        if(id=='Y')
        {    
        p=price-(price*0.20);
        }
        else
        {
        p=price;
        }
        System.out.println("Is it a Festival Day?(Y/N)");
        char fes=input.next().toUpperCase().charAt(0);
        double totalPrice;
        if(fes=='Y')
        {    
        totalPrice=p-(p*0.15);
        }
        else
        {
        totalPrice=p;
        }
        System.out.println("_______________________________________________________");
        System.out.println("\n");
        System.out.println("Total ticket price = Rs."+totalPrice);
        System.out.println("\n");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}