public class HouseBlend extends Beverage {
//    @Override
//    public String Operation() {
//        return "HouseBlend";
//    }

//    public String getDescription() {
//        return "HouseBlend";
//    }

    public HouseBlend() {
        description = super.description + " HouseBlend";
    }
    public double cost() {
        return 0.89;
    }

}