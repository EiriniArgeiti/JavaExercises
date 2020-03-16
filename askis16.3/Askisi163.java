
package askisi16.pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Askisi163 {

   public static void main(String[] args) throws IOException {
       String filename="C:\\Users\\super\\Documents\\NetBeansProjects\\askisi16.3\\src\\askisi16\\pkg3\\info.txt";
       File file = new File(filename);
       FileWriter fileWriter = new FileWriter(file, true); 
       PrintWriter writer = new PrintWriter(fileWriter);
       writer.println("NAME        AGE        HEIGHT(m)    WEIGHT(kg)");
       
       Scanner input= new Scanner(System.in);
      
       do{
            System.out.println("Enter a name.");
       String name= input.next();
       System.out.println("Enter their age.");
       int age= input.nextInt();
       System.out.println("Enter their height.");
       double height=input.nextDouble();
       System.out.println("Enter their weight.");
       double weight=input.nextDouble();
       System.out.println("Person was successfully created.");
       writer.println(info(name, age, height, weight));
       System.out.println("To create new person type new, to exit type exit.");
       String answer= input.next();
       if (answer.equals("exit")){
           break;
       }
       
       }while(true);
       writer.close();
       fileWriter.close();
       FileReader fileReader = new FileReader(file);
       BufferedReader reader = new BufferedReader(fileReader);
       String line = reader.readLine();
       while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        fileReader.close();
        reader.close();
    }
    public static String info(String name, int age, double height, double weight){
        return name+"      "+age+"      "+height+"      "+weight+"      ";
    }
}
