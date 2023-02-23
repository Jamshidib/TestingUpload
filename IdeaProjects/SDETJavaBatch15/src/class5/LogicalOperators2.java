package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {


      double mathScore=92.5;
      double historyScore=91.5;
      double  scienceScore=93.5;

      if(mathScore>90.0){
          if(historyScore>90){
              if(scienceScore>90){
                  System.out.println("Your are brilliant");
              }
          }
      }else {
          System.out.println("You need work hard");


      }







    }
}
