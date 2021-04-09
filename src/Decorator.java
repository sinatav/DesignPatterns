public abstract class Decorator extends Beverage {

    public abstract String getDescription();
    public abstract double cost();
//    private Beverage _beverage;

//    Decorator(Beverage beverage) {
//        this._beverage = beverage;
//    }

//    private Beverage getBeverage() {
//        return _beverage;
//    }

//    @Override
//    public String Operation() {
//        return getBeverage().Operation();
//    }

//    @Override
//    public String getDescription() {
//        return getBeverage().getDescription();
//    }

}