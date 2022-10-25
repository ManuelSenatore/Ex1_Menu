package manuelsenatore.ex1_menu.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Ordinazione {

    private int id;
    private static int internalId = 0;
    private List<Consumation> ordinazioni;

    private Tavolo tavolo;
    private int coperti;
    private LocalTime ora = LocalTime.now();


    public Ordinazione(List<Consumation> ordinazioni, Tavolo tavolo, int coperti) {
        this.id = internalId++;
        this.ordinazioni = ordinazioni;
        this.tavolo = tavolo;
        this.coperti = coperti;
    }

    public double calcolaTotaleOrdine(){
        double sum = 0;
        double sumCoperti = 0;
        for (int i = 0; i < ordinazioni.size(); i++) {
            sum += ordinazioni.get(i).getPrice();
        }
        sumCoperti = coperti * 2.00;
        System.out.println("Il totale è: " + (sum + sumCoperti) + " €");
        System.out.println("Coperto : " + sumCoperti + " €");
        return sum + sumCoperti;
    }

}
