package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double Weight;
        System.out.println();

        /*
        scanner => Name of the class
        scan is just a variable like  we create primitive variables
        = => assignment operator
        system.in=> tells the computer we want to read the data from keyboard.
         */

        System.out.println("Please Enter your age");
        int age= scan.nextInt();
        System.out.println("Your age "+age+" Years old");

        System.out.println("Please Enter your weight ");
        double weight=scan.nextDouble();
        System.out.println("your weight is"+weight+"kgs");
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry"+hungry);

        System.out.println("Please Enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);

        System.out.println("Please Enter your name");
        String name=scan.next();
        System.out.println("Your name is "+name);


        scan.nextInt();
        System.out.println("Please Enter your full name");
        String fullName=scan.next();
        System.out.println("Your full name is "+fullName);


        }


    }


