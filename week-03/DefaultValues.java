
/**
 * Write a description of class DefaultValues here.
 *
 * @author Purnima
 * @version v4
 */
public class DefaultValues
{
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g;
        char h;
        public static void main(String[] args){
        DefaultValues v1= new DefaultValues();
        System.out.println("Byte"+v1.a);
        System.out.println("Short"+v1.b);
        System.out.println("Int"+v1.c);
        System.out.println("Long"+v1.d);
        System.out.println("Float"+v1.e);
        System.out.println("Double"+v1.f);
        System.out.println("Boolean"+v1.g);
        System.out.println("Char"+v1.h);
        /*Member variables in a class are automatically give default value by java when an boject is created.
         * But the local variables need an object to call them as they don't have default value.*/
}
}