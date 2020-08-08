package headfirst.decorator.starbuzzCoffee;

public abstract class Beverage {

    String description = "Unkown beverage";
    String size = "";

    public final String TALL = "TALL";
    public final String GRANDE = "GRANDE";
    public final String VENTI = "VENTI";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
