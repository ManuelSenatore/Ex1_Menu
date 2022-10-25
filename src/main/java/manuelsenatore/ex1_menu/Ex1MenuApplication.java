package manuelsenatore.ex1_menu;

import manuelsenatore.ex1_menu.beans.*;
import manuelsenatore.ex1_menu.config.Config1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ex1MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ex1MenuApplication.class, args);
         getTavolo();

        Ordinazione ordinazioni1 = new Ordinazione(conf1(), getTavolo(), 6);
        ordinazioni1.calcolaTotaleOrdine();
    }

    public static List<Consumation> conf1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);

        Consumation p1 = ctx.getBean("Margherita", Consumation.class);
        System.out.println(p1.getProductName() + " - prezzo " + p1.getPrice() + " €");

        Consumation p2 = ctx.getBean("MargheritaConCotto", Consumation.class);
        System.out.println(p2.getProductName() + " - prezzo " + p2.getPrice() + " €");

        Consumation p3 = ctx.getBean("PizzaDelDiavolo", Consumation.class);
        System.out.println(p3.getProductName() + " - prezzo " + p3.getPrice() + " €");


        List<Consumation> consumations = new ArrayList<>();
        consumations.add(p1);
        consumations.add(p2);
        consumations.add(p3);


        ((AnnotationConfigApplicationContext)ctx).close();

        return consumations;
    }

    public static Tavolo getTavolo(){
        Tavolo tav = new Tavolo(10, Stato.LIBERO);
        return tav;
    }

}
