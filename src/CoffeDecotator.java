public class CoffeDecotator implements Coffee{
    Coffee coffee;
    public CoffeDecotator(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}
