package manuelsenatore.ex1_menu.beans;

public class ExtraProsciuttoDecorator extends ExtraTopping{

    public ExtraProsciuttoDecorator (Consumation consumation) {
        this.consumation = consumation;
    }


    @Override
    public double getPrice() {
        return this.consumation.getPrice() + 0.50;
    }

    @Override
    public String getProductName() {
        return this.consumation.getProductName() + " con prosciutto";
    }
}
