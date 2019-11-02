public class DoubleSugar extends CoffeDecotator {
    public DoubleSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.2;
    }
}