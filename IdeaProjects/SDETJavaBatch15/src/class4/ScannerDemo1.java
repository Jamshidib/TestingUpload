package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {


        //Below line helps us get the input from the keyboard
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine(); //nextlLine is used when we have to take sentence from the keyboard
        System.out.println("My name is "+name);
    }
}
