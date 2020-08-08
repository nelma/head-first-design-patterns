package headfirst.Decorator.starbuzzCoffee;

//extends pq precisa ser um subtipo. Torna-se intercambiável
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

//    public abstract String getSize();
}
