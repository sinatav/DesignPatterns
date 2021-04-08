public class Mocha extends Decorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String Operation() {
        return super.Operation() + " " + addBehavior();
    }

    
}