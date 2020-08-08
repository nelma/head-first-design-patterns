package headfirst.Decorator.starbuzzCoffee;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

//    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if(getSize() == beverage.TALL) {
            cost += .10;
        } else if(getSize() == beverage.GRANDE) {
            cost += .15;
        } else if(getSize() == beverage.VENTI) {
            cost += .20;
        }

        return cost;
    }
}
