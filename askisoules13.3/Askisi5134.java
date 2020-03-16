//Based on age what can you do?
//lt 16>>You cannot drive
//16-17>>You can drive but not vote
//18-21>>You can vote but not drink
//gt 22>>You can do anything 
package askisi6.pkg13.pkg4;

import java.util.Scanner;


public class Askisi5134 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Insert your age.");
        int answer=input.nextInt();
        if(answer<16){
            System.out.println("You cannot drive.");
        }else if( answer>=16 && answer<=17){
            System.out.println("You can drive but you cannot vote.");
        }else if( answer>=18 && answer<=21){
            System.out.println("You can vote but you cannot drink.");
        }else if( answer>=16 && answer<=17){
            System.out.println("You can drive but you cannot vote.");
        }else if( answer>=16 && answer<=17){
            System.out.println("You can drive but you cannot vote.");
        }else if( answer>=22){
            System.out.println("You can do anything.");
            
        }
    }
    
}
