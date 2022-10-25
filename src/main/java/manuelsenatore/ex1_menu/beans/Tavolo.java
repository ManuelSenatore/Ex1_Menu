package manuelsenatore.ex1_menu.beans;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Tavolo {
    private int id;
    private static int internalId = 0;
    private int copertiMax;
    private Stato stato;

    public Tavolo(int copertiMax, Stato stato) {
        this.id = internalId++;
        this.copertiMax = copertiMax;
        this.stato = stato;
    }
}
