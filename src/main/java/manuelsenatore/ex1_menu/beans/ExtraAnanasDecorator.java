package manuelsenatore.ex1_menu.beans;

public class ExtraAnanasDecorator extends ExtraTopping{

    public ExtraAnanasDecorator(Consumation consumation) {
        this.consumation = consumation;
    }

    @Override
    public double getPrice() {
        return this.consumation.getPrice() + 1.00;
    }

    @Override
    public String getProductName() {
        return this.consumation.getProductName() + " con ananas";
    }
}
