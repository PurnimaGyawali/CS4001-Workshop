import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author Purnima
 * @version v6
 */
public class RickshawFare
{
    public static void main(String[] args){
    double baseFare=25.50;
    double perKm=10.90;
    double perMin=5.25;
    double localDicR=0.15;
    double nightSur=0.25;
    Scanner input= new Scanner(System.in);
    System.out.println("*******************RICKSHAW FARE*******************");
    System.out.println("\n");
    System.out.println("Travelled distance per Km?:");
    double dis=input.nextDouble();
    System.out.println("Travelled time per minute:");
    double min=input.nextDouble();
    input.nextLine();
    System.out.println("Is it Local customer travelling long distance?(Y/N):");
    String local=input.nextLine().toUpperCase();
    boolean yLocal=local.equals("Y");
    System.out.println("Is is During Night?(Y/N)");
    String night=input.nextLine().toUpperCase();
    boolean yNight=night.equals("Y");
    double fare=baseFare+(perKm*dis)+(perMin*min);
    double lDis=(yLocal && dis > 15)? fare*localDicR :0;
    double nSur=(yNight)? fare*nightSur :0;
    double totalFare=fare-lDis+nSur;
    System.out.println("\n");
    System.out.println("...................................................");
    System.out.println("Total Rickshaw Fare:\tRs."+totalFare);
    System.out.println("\n");
    System.out.println("***************************************************");
    }
}