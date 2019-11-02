public class Main {


    public static void main(String[] args) {
//      1) ესპრესო ორმაგი შაქრით და რძით


        Coffee coffee = new Espresso(new DoubleSugar(new milk()));
        System.out.println(
                String.format("espreso ormagi shaqrit da rdzit",coffee.getPrice())
        );


//        2) შავი ყავა სოიოს რძით და ორმაგი შაქრით


        Coffee coffee1 = new BlackCoffee(new SoyaMilk(new DoubleSugar()));
        System.out.println(
                String.format("shavi yava soios rdzit da ormagi shaqrit",coffee1.getPrice())
        );
    }
}
