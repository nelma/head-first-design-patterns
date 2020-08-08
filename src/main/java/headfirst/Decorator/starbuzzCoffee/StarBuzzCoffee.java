package headfirst.Decorator.starbuzzCoffee;

public class StarBuzzCoffee {

    public static void main(String[] args) {

        //pedindo um espresso sem condimentos
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());


        //pedindo um  DarkRoast e com 2x Mocha e Whip
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());


        //pedindo um HouseBlend com Soy, Mocha e Whip
        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize("TALL");
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());


    }
}
