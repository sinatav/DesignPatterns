public class Decaf extends Beverage {
//    @Override
//    public String Operation() {
//        return "Decaf";
//    }

//    public String getDescription() {
//        return "Decaf";
//    }

    public Decaf() {
        description = super.description + " Decaf";
    }
    public double cost() {
        return 1.05;
    }

}