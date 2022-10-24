package manuelsenatore.ex1_menu.beans;

public class Pizza extends Consumation{

    public Pizza() {
        this.productName = "Pizza";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}
