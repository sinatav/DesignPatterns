public class Decaf extends Beverage {
    public Decaf() {
        description = getDescription();
    }
    public double cost() {
        return 1.05;
    }
    public String getDescription() {
        return "Delicious Decaf";
    }
}