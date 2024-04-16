public enum Direction { // CLASS CHECK ADDRESS, CONPOINT TIME 鎖死, TESTING 4個PLACE
    // Finite number of values
    EAST(1, 'E'), //
    SOUTH(2, 'S'), //
    WEST(-1, 'W'), //
    NORTH(-2, 'N'),//
    ;

    private int value;

    private char c;

    // private final int value; 不能set更改

    // private Direction(){

    private Direction(int value, char c) {
        this.value = value;
        this.c = c;
    }

    public int getValue() {
        return this.value;
    }

    public char getC() {
        return this.c;
    }

    public void setValue(int value) {
        this.value = value;
    }
    // instect method

    public Direction oppsite() {
        for (Direction d : Direction.values()) {
            if (this.value * -1 == d.getValue())
                return d;
        }
        return null;
    }

    // static method
    public static Direction oppsite(Direction direction) {
        for (Direction d : Direction.values()) { // values ()-> implicit static method
            if (direction.getValue() * -1 == d.getValue())
                return d;
        }
        return null;
    }

    // You cannot create Direction object by yourself.

    public static void main(String[] args) {
        // check if the direction EAST?
        House house = new House(Direction.EAST);
        house.SetDirection(Direction.NORTH);

        System.out.println(house.getDirection() == Direction.EAST); // TRUE

        System.out.println(Direction.NORTH.getValue()); // 4
        // Direction.NORTH.setValue(5);

        System.out.println(Direction.EAST.oppsite().name());

        Direction direction = Direction.NORTH;
        System.out.println("degree=" +degree);
    }

    public static int getDirectionDegree(Direction direction) {
        int result = -1;
        switch (direction) {
            case NORTH:
                return 360;
            case EAST:
                return 90;
            case SOUTH:
                return 180;
            case WEST:
                return 270;
            default:
                return -1;
        }
        return result;
    }

}