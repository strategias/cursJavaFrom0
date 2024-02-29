package CakeExercise;

public class weddingCake extends superCake{
    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public weddingCake(String flavor, int tiers){
        super(flavor);
        this.tiers = tiers;


    }
}
