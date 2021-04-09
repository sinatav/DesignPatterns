public abstract class Beverage {
    String description = "Delicious";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}