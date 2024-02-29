package CakeExercise;

public class birthdayCake extends superCake {
    private int candles;

    // Constructor
    public birthdayCake(String flavor, int candles) {
        super(flavor); // Setting the flavor using superclass constructor
        this.candles = candles;
    }

    // Getter for candles
    public int getCandles() {
        return candles;
    }

    // Setter for candles
    public void setCandles(int candles) {
        this.candles = candles;
    }
}


