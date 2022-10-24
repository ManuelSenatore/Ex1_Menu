package manuelsenatore.ex1_menu.beans;

public class Drink extends Consumation{

    public Drink() {
        productName = "Drink";
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
