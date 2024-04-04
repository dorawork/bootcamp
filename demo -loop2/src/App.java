public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //1. initial value
        //2. continue condition
        //3. incremental deremental
        for (int i = 0 ; i <3 ; i++){

        }

        int [] arr = new int [] {2, 10,3, -1};
        
        // for-each
        for (int i :arr){
            System.out.println(i);
        }
        String[]strings = new String[] {"abc" , "def"};
        for (String str : strings){
            System.out.print(str);
        }
        int count = 0;
        int x =0;
        while (count <strings.length) {
            System.out.println(strings[count]);
            if (x > 1){
                count++;
            }
                //Step 1 :check if count <strings.lenght (0 < 2)
                //Step 2 :print out sth. ->count++
                //Step 3: check if count <strings.lenght (1<2)
                //Step 4: print out sth. ->count++
                //Step 5: check if count <strings.lenght (2 < 2) exit

                //intfinite loop
                //byte b =0;
                //while ( (b<127)) {
                    //b++;

                    int a = 1023;
                    //target: int array [1, 0, 2, 3]
                    int c =1023 /10; //102
                    int d = 1023 % 10 //3
                    int copy = a;
                    count = 0;
                    while ((copy>0)) {
                        copy/=10;
                        count++;
                    }
                    System.out.println("count=" + count); //4
                    int[]result = new int[];

                }
                //do-while 一定一要做一次  不同 for loop 可以唔洗入都OK
                count=0;//假設是0 就執行PRINT
                do{
                    System.out.println("Hello");
                    count++; // 0 + 1
                }while (count < 3);

                }
}
