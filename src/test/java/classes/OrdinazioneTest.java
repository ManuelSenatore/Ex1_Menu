package classes;

import manuelsenatore.ex1_menu.Ex1MenuApplication;
import manuelsenatore.ex1_menu.beans.Consumation;
import manuelsenatore.ex1_menu.beans.Ordinazione;
import manuelsenatore.ex1_menu.beans.Stato;
import manuelsenatore.ex1_menu.beans.Tavolo;
import org.junit.Test;

import java.util.List;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class OrdinazioneTest {

    List<Consumation> consumations = Ex1MenuApplication.conf1();
    Tavolo tav = Ex1MenuApplication.getTavolo();
    Ordinazione ordinazione = new Ordinazione(consumations, tav, 6);

    @Test
    public void test(){
        assertEquals("Dovrebbe ritornare 23", ordinazione.calcolaTotaleOrdine(), 23.0);
    }
}
