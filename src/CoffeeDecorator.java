public class CoffeeDecorator implements Coffee {

    Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public double getPrice() {
            return coffee.getPrice();
        }
    }

