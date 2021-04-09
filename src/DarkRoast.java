public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = getDescription();
    }
    public double cost() {
        return 0.99;
    }
    public String getDescription() {
        return "Delicious DarkRoast";
    }
}