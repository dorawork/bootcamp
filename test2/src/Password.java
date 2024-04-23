public class Password {

    private String password;

    public Password(String x) {
        this.password = x;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password){ //需要更改才使用 HAHA=門口
        this.password = password; //改名 條件   右邊 password 根據上方條件 (String password) 
                                        //26 行 = ("BBB") 更改 p1.password object
    }

    public void append(Password password) {
        password.setPassword("XYZ"); //p2
        this.password = "BCA"; //p1
    }

    public static void main(String[] args) {
        Password p1 = new Password("ABC"); //p1原先名稱
        Password p2 = new Password("BCD"); //p2 原先名稱
        p1.setPassword("BBB"); //更改P1的名稱
        p1.append(p2); //第17行 (p1= "BCA" , )
        System.out.println(p1.getPassword() + p2.getPassword());

    }
}
