public abstract class Decorator implements Beverage {
    private Beverage _beverage;

    Decorator(Beverage beverage) {
        this._beverage = beverage;
    }
}
