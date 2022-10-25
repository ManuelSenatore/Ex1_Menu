package classes;

import manuelsenatore.ex1_menu.Ex1MenuApplication;
import manuelsenatore.ex1_menu.beans.Consumation;
import manuelsenatore.ex1_menu.beans.Ordinazione;
import org.junit.Test;

import java.util.List;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class OrdinazioneTest {

    List<Consumation> consumations = Ex1MenuApplication.conf1();
    Ordinazione ordinazione = new Ordinazione(consumations);

    @Test
    public void test(){
        assertEquals("Dovrebbe ritornare 11", ordinazione.calcolaTotaleOrdine(), 11.0);
    }
}
