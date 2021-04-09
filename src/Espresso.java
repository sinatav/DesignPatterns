public class Espresso extends Beverage {
//    @Override
//    public String Operation() {
//        return "Espresso";
//    }

//    public String getDescription() {
//        return "Espresso";
//    }

    public Espresso() {
        description = super.description + " Espresso";
    }
    public double cost() {
        return 1.99;
    }

}