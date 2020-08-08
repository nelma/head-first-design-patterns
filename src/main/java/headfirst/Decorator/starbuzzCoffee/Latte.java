package headfirst.Decorator.starbuzzCoffee;

public class Latte extends CondimentDecorator {

    Beverage beverage;

    public Latte(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Latte";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
