public class Soy extends Decorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String Operation() {
        return super.Operation() + " " + addBehavior();
    }

    private String addBehavior() {
        return "Add Soy";
    }

    public String getDescription() {
        return super.getDescription() + " " + addBehavior();
    }

}