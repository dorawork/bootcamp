public class Car {

    // Attributes - 狀態 形容詞 car 會變化 oject 帶來新 method

    private String color;// 不想比人看到, 自已用 顏色 "Red" "Yellow"

    private double speed;

    private int capacity; // 容量

    private boolean isOverspeed; // fasle , useless -> we should use speed to derive isOverSpeed()

    //

    // Behavior or instance methods 這部車的行為  設計, 車到指定速度觸發
    // Setter

    public static void main(String[] args) {
    System.out.println("Hello");
    Car c = new Car (); //c 指針-->生產 右邊 Car address(reference) --> speed capacity, array object
    c.setColor("RED");
    System.out.println("Color=" + c.getColor()); //RED Print set color
    //所以c.任何野都找到
    //或者Car c2 = new Car (); 生產另一部車
    Car c2 = new Car ();
    c2.setColor("Yellow"); //另一部車
}
    public void setColor(String x) { //提供工具 一間房 入面有String x
        this.color = x; //
    }

    // Getter
    public String getColor() {  //因為公眾左一個地方可以傳取 get read
        return this.color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if (speed > 50.0d)
        this.isOverspeed = true; //SET條件 用家改變不到條件, 只可以放速度上去
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        
    }

    public int getCapacity() {
        return this.capacity;
    }

    // getter get冇set條件?因為37行
    public boolean isOverSpeed() { //因為boolean不用寫get use is
        return this.isOverspeed;  //set ??
    }

    public String toString(){
        return "Car(" + //
        "color=" + this.color + //
        ", speed=" + this.speed + //
        ",capacity=" +this.capacity +//
        ")";
    }
}
