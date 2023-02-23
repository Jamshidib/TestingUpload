package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";

        /*
        java executes code from top to bottem but if we have multiple operation on the some lines it executes them from
        lift to right
         */

        System.out.println("*****"+firstName+" "+lastName+"+****");
        System.out.println("Firstname="+firstName);
        System.out.println("lastName="+ lastName);

        System.out.println("10"+"10");
        String space="";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+""+lastName);

        System.out.println(firstName+10);
        System.out.println(firstName+true);








    }
}
