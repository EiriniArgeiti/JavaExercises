package classexercise;

import java.util.Scanner;
import java.lang.Math;

public class ClassExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = input.next();
        System.out.println("Okay, " + name + " what is your gender?");
        String gender = input.next();

        if (gender.equals("female")) {
            System.out.println("ok, " + name + " you are a female");
        } else {
            System.out.println("okay, " + name + " you are a male");
        }
        System.out.println("Okay ," + name + " what is your age?");
        int age = input.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("You are too young for this app.");
            System.out.println("Come in " + (6 - age) + " years when you will be a student.");
        } else if (age >= 6 && age <= 18) {
            System.out.println("Oh,you are a student");
            System.out.println("keep up " + (19 - age) + " years and you will be able to earn money.");
        } else if (age >= 19 && age <= 40) {
            System.out.println("Well,you must be employed");
            System.out.println("You finished school " + (age - 18) + " years ago.");
        }
        calculateAge(age);
        System.out.println("Choose your favorite season: ");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("It must be cold outside");
                break;
            case 2:
                System.out.println("Ohh, the flowers are very beautiful these days");
                break;
            case 3:
                System.out.println("Let's go swimming!");
                break;
            case 4:
                System.out.println("The trees are full of brown leaves.");
                break;
            default:
                break;
        }
        System.out.println(name + " what is your weight?");
        double weight = input.nextDouble();
        System.out.println("and what is your height?");
        double height = input.nextDouble();
        double bmi = calculateBmi(weight, height);
        System.out.println("Your bmi is " + bmi);
        if (bmi <= 18.5) {
            System.out.println("You are underweight");

        } else if (bmi >= 18.6 && bmi <= 24.9) {
            System.out.println("Your weight is normal.");

        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese");
        }
        int numOfDays = age * 365;
        System.out.println("You've lived " + numOfDays + " days");

        int luckyDay = sumOfDigits(numOfDays);
        findYourLuckyDay(luckyDay);
        
        if((20<=age&& age <=40)&& luckyDay == 2){
            if ((age>=20 && age<=25)&& gender.equals("male")){
                System.out.println("Hello "+name+" have a great time!");
            }else if (age>25 && gender.equals("male")){
                System.out.println("Hello Mr ,"+name+" have a great time!");
            }else if (gender.equals("female")){
                System.out.println("Are you married?");
                String answer= input.next();
                if (answer.equals("yes")){
                    System.out.println("Hello Mrs, "+name+" have a great night!");
                }else{
                    System.out.println("Hello Ms, "+name+ " have a great night!");
                }
            }
          
            
        }else{
            System.out.println("Sorry, you do not deem fit to enter.");
        }

    }

    static int sumOfDigits(int numOfDays) {
        int sumOfDigits = 0;
        while (numOfDays > 0) {
            sumOfDigits = sumOfDigits + numOfDays % 10;
            numOfDays = numOfDays / 10;
        }
        if (sumOfDigits > 6) {
            return sumOfDigits = sumOfDigits % 7;
        } else {
            return sumOfDigits;
        }
    }

    static void findYourLuckyDay(int sumOfDigits) {
        if (sumOfDigits == 0) {
            System.out.println("Your lucky day is Monday.");
        } else if (sumOfDigits == 1) {
            System.out.println("Your lucky day is Tuesday.");
        } else if (sumOfDigits == 2) {
            System.out.println("Your lucky day is Wednesday.");
        } else if (sumOfDigits == 3) {
            System.out.println("Your lucky day is Thursday.");
        } else if (sumOfDigits == 4) {
            System.out.println("Your lucky day is Friday.");
        } else if (sumOfDigits == 5) {
            System.out.println("Your lucky day is Saturday.");
        } else if (sumOfDigits == 6) {
            System.out.println("Your lucky day is Sunday.");
        } else if (sumOfDigits > 6) {
            int division = sumOfDigits % 7;
        }

    }

    static int calculateDays(int age) {
        int numOfDays = age * 365;
        return numOfDays;
    }

    static void calculateAge(int age) {
        int yearOfBirth = 2020 - age;
        int difference = yearOfBirth - 1980;
        if (age >= 40) {
            System.out.println("In 1980 you were " + difference + " years old.");
        }
        System.out.println("In 2040 you will be " + (age + 20) + " years old");
    }

    static double calculateBmi(double weight, double height) {
        double bmi = (weight / (height * height));
        return bmi;
    }
}
