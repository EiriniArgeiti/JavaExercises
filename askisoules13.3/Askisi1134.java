// What class in school are you going according to age;
//   Use an if-else-if.
//   For example: 5-12 dimotiko, ...
//   Can you use a switch statement?
package askisi1.pkg13.pkg4;

import java.util.Scanner;


public class Askisi1134 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in) ;
        System.out.println("what is your age?");
        int age= input.nextInt();
        if (age>=6 && age<=12){
            System.out.println("you are going to primary school.");
        }else if (age> 12 && age<15){
            System.out.println("you are going to middle school.");
        }else if(age>15 && age<=18) {
            System.out.println("you are going to high school.");
        }else{
            System.out.println("you are a graduate!");
        }
        
    }
    
}
