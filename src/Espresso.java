public class Espresso extends Beverage {
    public Espresso() {
        description = getDescription();
    }
    public double cost() {
        return 1.99;
    }
    public String getDescription() {
        return "Delicious Espresso";
    }

}