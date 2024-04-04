public class App {
    public static void main(String[] args) throws Exception {
        int x = 3;
        int y = 0;

        if (x > 3) {
            y = 10;
            System.out.println("Hello, Paul!" + y);
        } else { // 另一個條件 2選1
            System.out.println("Paul come" + y);// 不能用v因為區域不在
        }

        if (x > 2) {
            System.out.println("x > 2");
        } else if (x >= 0 && x <= 2) {
            System.out.println("x >=0 and x <=2");
        } else {
            System.out.println("x <= 0");
        }

        int a = 11;
        int b = 10;
        int max = a;
        // if (a>b){
        // max= a;
        // 用else
        if (b > a) { // 假設成立後 右B = max, 可以放 IF TRUE OR FALSE
            max = b;
        }
        System.out.println("The max numberis " + max + ".");

        // Example 2

        String day = "Sunday";

        if ("Sunday".equals(day)) { // boolean result TRUE OR FALSE
            System.out.println(day + " is weekend.");
        } else if ("Saturday".equals(day)) { // 另一個條件 equal + string + boolean
            System.out.println(day + " is not weekend");
        }

        // Example 3
        int score = 85;
        char grade = ' ';
        if ((score > 90)) {
            grade = 'A';
        } else if (score >= 80 && score <= 90) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }

        String examResult = "passed"; // 另一個if
        if (grade == 'F') { // 當 grade F =failed
            examResult = "failed";
        }
        System.out.println("The grade is " + grade + " and " + examResult + ".");
    }
}