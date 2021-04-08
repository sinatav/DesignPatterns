public abstract class Decorator implements Beverage {
    private Beverage _beverage;

    Decorator(Beverage beverage) {
        this._beverage = beverage;
    }

    private Beverage getBeverage() {
        return _beverage;
    }
}
