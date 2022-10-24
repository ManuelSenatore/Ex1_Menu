package manuelsenatore.ex1_menu.beans;

public class ExtraMozzarellaDecorator extends ExtraTopping{

    public ExtraMozzarellaDecorator (Consumation consumation) {
        this.consumation = consumation;
    }


    @Override
    public double getPrice() {
        return this.consumation.getPrice() + 0.50;
    }

    @Override
    public String getProductName() {
        return this.consumation.getProductName() + " con mozzarella";
    }
}
