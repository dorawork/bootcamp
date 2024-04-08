public class car {

    // Attributes - 狀態 形容詞

    private String color;// 自已用 顏色 "Red" "Yellow"

    private double speed;

    private int capacity;

    private boolean isOverspeed; // fasle , useless -> we should use speed to derive isOverSpeed()

    //

    // Behavior or instance methods 行為
    // Setter
    public void setColor(String x) {
        this.color = x;
    }

    // Getter
    public String getColor() {
        return this.color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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

    // getter
    public boolean isOverSpeed() {
        return this.isOverspeed;
    }

    //public String toString(){
        //retuen "car"//

    }
