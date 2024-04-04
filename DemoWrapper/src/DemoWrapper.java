public class DemoWrapper {
    public static void main(String[] args) throws Exception {
        int x = 1; // +, -, *, / , %
        Integer x2 = 1; // Integer wrapper class
        Integer x3 = new Integer("1");

        char c = 1;
        Character c2 = 1;
        //Character c3 = new Character("1");

        byte q = 1;
        Byte q2 = 1;
        Byte q3 = new Byte("1");

        short w = 1;
        Short w2 = 1;
        Short w3 = new Short("1");

        long e = 1;
        Long e2 = 1L;
        Long e3 = new Long("1");

        float r = 1;
        Float r2 = 1F;
        Float r3 = new Float("1");

        double t = 1;
        Double t2 = 1D;
        Double t3 = new Double("1");


        System.out.println("Hello, World!");



                Integer num1 = Integer.valueOf(127);
                Integer num2 = Integer.valueOf(127);
                System.out.println(num1 == num2);//true
                System.out.println(num1.equals(num2));//true

                String str = "hello";
                String str2 = "hello";
                String str3 = new String("hello");
                String str4 = String.valueOf("hello");
                // "==" is checking if they are same object
                System.out.println(str == str4);//true
                System.out.println(str == str3);//false
                System.out.println(str.equals(str2));// true
                System.out.println(str.equals(str3));// true

                //equals object



                //17 Types +array
                Integer i1 =3;// 3 (int value ->Integer Object with value3 ->auto-box)
                int i2 =i1; // i1 (Integer Object) ->unbox

                Character c5 ='c';
                char c6 = c2;

                Integer i3 =10;
                long s4 =i3; //Integer -> int (unbox) -> long (upcast)
                //short s5 =i3; //Integer -> int (unbox) -> short (un-secure) 

                int i5 = 12;
                Long l5 = (long) i5;
    }
}
