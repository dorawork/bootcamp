public class App {
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 10;
        int max = a;
        if (b > a) { // 假設成立後 右B = max, 可以放 IF TRUE OR FALSE
            max = b;
        }
        System.out.println("The max numberis " + max + ".");

        // Example 2

        String day = "Sunday";

        if ("Sunday".equals(day)) {
            System.out.println(day + " is weekend.");
        } else if ("Saturday".equals(day)) {
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
        String examResult = "passed";
        if (grade == 'F') { //當 grade F =failed
            examResult = "failed";
        }
        System.out.println("The grade is " + grade + " and " + examResult + ".");
    }
}
