package manuelsenatore.ex1_menu.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Ordinazione {

    private List<Consumation> ordinazioni;

    public double calcolaTotaleOrdine(){
        double sum = 0;

        for (int i = 0; i < ordinazioni.size(); i++) {
            sum += ordinazioni.get(i).getPrice();
        }
        System.out.println("Il totale è: " + sum + " €");
        return sum;
    }

}
