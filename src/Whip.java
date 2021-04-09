public class Whip extends Decorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

//    @Override
//    public String Operation() {
//        return super.Operation() + " " + addBehavior();
//    }

    private String addBehavior() {
        return "Add Whip";
    }

    public String getDescription() {
        return super.getDescription() + " " + addBehavior();
    }

}