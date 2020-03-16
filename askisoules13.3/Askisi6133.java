// Program should ask your weight and planet. Compute your weight on the planet based on the table below:
//#    Planet    Relative gravity
//1    Venus        0.78
//2    Mars        0.39
//3    Jupiter    2.65
//4    Saturn    1.17
//5    Uranus    1.05
//6    Neptune    1.23
package askisi6.pkg13.pkg3;

import java.util.Scanner;


public class Askisi6133 {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Insert your weight.");
        double weight= input.nextDouble();
        System.out.println("What is your favorite planet?");
        String planet= input.next();
        switch (planet) {
            case "Venus":
                System.out.println("Your weight in Venus is: "+newWeight(weight, 0.78));
                break;
            case "Mars":
                System.out.println("Your weight in Mars is: "+newWeight(weight, 0.39));
                break;
            case "Jupiter":
                System.out.println("Your weight in Jupiter is: "+newWeight(weight, 2.65));
                break;
            case "Saturn":
                System.out.println("Your weight in Saturn is: "+newWeight(weight, 1.17));
                break;
            case "Uranus":
                System.out.println("Your weight in Uranus is: "+newWeight(weight, 1.05));
                break;
            case "Neptune":
                System.out.println("Your weight in Neptune is: "+newWeight(weight, 1.23));
                break;
           
        }
        
        
    }
    public static double newWeight(double weight, double factor){
        return weight*factor;
    }
}
