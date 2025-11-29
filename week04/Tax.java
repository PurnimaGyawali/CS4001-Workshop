import java.util.Scanner;

/**
 * Write a description of class Tax here.
 *
 * @author Purnima
 * @version v1
 */
public class Tax
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^INCOME TAX CALCULATION^^^^^^^^^^^^^^^");
        System.out.println("Enter your income:");
        double income=input.nextDouble();
        double incomeTax;
        if (income<=500000)
        { incomeTax=income*0.01;
        }
        else if(income>500000 && income<=700000)
        { incomeTax=5000+((income-500000)*0.10);
        }
        else if(income>700000 && income<=1000000)
        { incomeTax=15000+((income-700000)*0.20);
        }
        else if(income>1000000 && income<=2000000)
        { incomeTax=35000+((income-1000000)*0.30);
        }
        else if(income>2000000 && income<=5000000)
        { incomeTax=335000+((income-2000000)*0.36);
        }
        else
        { incomeTax=1135000+((income-5000000)*0.39);
        }
        System.out.println("\n");
        System.out.println("Your Income Tax = Rs."+incomeTax);
        System.out.println("\n");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}