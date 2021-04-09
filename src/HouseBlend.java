public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = getDescription();
    }
    public double cost() {
        return 0.89;
    }

    public String getDescription() {
        return "Delicious HouseBlend";
    }

}