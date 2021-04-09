public class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

//    @Override
//    public String Operation() {
//        return super.Operation() + " " + addBehavior();
//    }

    private String addBehavior() {
        return "Add Milk";
    }

    public String getDescription() {
        return super.getDescription() + " " + addBehavior();
    }
}