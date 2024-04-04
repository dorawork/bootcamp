package DemoFotLoop.src;

public class Demoif {
  public static void main(String[] args) {

      int x = 1;
      int y = 0;
      if (x >3 ) { 
        y = 10;
        System.out.println ("Hello World!" + y); //Hello World! 10
      } else { //x <= 3
        System.out.println ("另一句");

      }
if (x >2 ) {
  System.out.println("x >2");
  } else if (x > 0 && x < 2) { //and events
    System.out.println("x >=0 and x <=2");
  }else{
    System.out.println ("x<0");
  }
                        //Emaple 2: equals ()
                        String day ="Sunday";
                        if (day.equals("Sunday")){
                        }
                          System.out.println(day + "is weekend");
                        }else {
                          System.out.println(day + "is weekday");

                        }
                    
                      
                        String target = "weekend";
      if ("Monday".equals(day) ||  "Tueday".equals(day)||
           "Wednesday".equals(day)){ //day 不會=MONDAY
        target = "weekend";

      }
      System.out.println(day + "is " + target);

      //Compare Strings
      //1. String value compares with String variable ("Monday".equals(day))
      //2. Srting variable compares with variable ((day / target))


            //score > 90 -> A (Pass)
            // 80 - 90 -> B (Pass)
            // 79 - 70 -> C (Pass)
            // < 70 -> F (Fail)

            int score = 69;
            char grade = ' ';

            if (score > 90){
              grade = 'A';
            } else if (score >= 80 ) {
              grade = 'B';
            } else if (score >= 70){
              grade = 'C';
            } else {
              grade = 'F';
            }
            String examResult = "passed";
            if (grade == 'F'){
              examResult = "failed";
            }
            System.out.println ("The grade is " + grade + " and " + examResult + " . ");
            //Print out: "The grade is B and pass."
            int age = 18;
             String lastName = ("Lau");

      //if the left condition pass, the right one will be skipped
      //if (age ==18 || "Lau".equals(lastName) //age == 18

       // if (age ==18 || "Lau".equals(lastName) && x ==3); //先觸發 "Lau".equals(lastName) && x ==3

        // if ((age ==18 || "Lau".equals(lastName)) && x ==3); // 先行 (age ==18 || "Lau".equals(lastName) 

        Boolean b2 = true && false;
        Boolean b3 = true && false;
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println(false & false);//false
        System.out.println(true & true); //true

        System.out.println(true || false); //true
        System.out.println( false || true); //true


  }
}