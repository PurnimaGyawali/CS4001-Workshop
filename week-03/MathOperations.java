import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author Purnima
 * @version v1
 */
public class MathOperations
{
    public static void main(String[] args){
        System.out.println("Arithmathic operations:");
        int a=10;
        int b=20;
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println("\n");
        System.out.println("Addition:"+c);
        System.out.println("Subtraction:"+c);
        System.out.println("Multiplication:"+c);
        System.out.println("Division:"+c);
        System.out.println("\n");
        System.out.println("Unary operations:");
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println("\n");
        System.out.println("Assignment operations:");
        int x=5;
        x+=10;
        System.out.println(x);
        x-=2;
        System.out.println(x);
        System.out.println("\n");
        System.out.println("Relational operations:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("\n");
        System.out.println("Logical operations:");
        boolean n1=true;
        boolean n2=false;
        System.out.println("\n");
        System.out.println("Tearnary operations:");
        Scanner input= new Scanner(System.in);
        System.out.println("Ask for his/her age:");
        int age = input.nextInt();
        String isValid =(age>=18)?"Driving is allowed":"Driving is not allowed";
        System.out.println(isValid);
    }
}