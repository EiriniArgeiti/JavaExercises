//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
package askisoules12.pkg3;

import java.util.Scanner;


public class Askisoules123 {

    
    public static void main(String[] args) {
//        Scanner inputFah= new Scanner (System.in);
//        System.out.println("Enter temperature in Fahreneit.");
//        double tempFah= inputFah.nextDouble();
//        double FahtoCel= ((tempFah-32)*5/9);
//        System.out.println("Current temperature in Celsius is: "+FahtoCel);
       
        System.out.println("----------------");
        
//        Write a Java program to convert seconds to hour, minute and seconds.
        Scanner inputSec= new Scanner(System.in);
        System.out.println("Enter time unit in seconds.");
        int seconds= inputSec.nextInt();
        float minutes=seconds/60;
        float hour=minutes/60;
        System.out.printf("are %f hours", hour);
        System.out.println();
        
        System.out.println("Enter time unit in minutes.");
        int minute=inputSec.nextInt();
        float second=minute*60;
        System.out.printf("are %f seconds", second);
        System.out.println();
        
        
    }
    
}
