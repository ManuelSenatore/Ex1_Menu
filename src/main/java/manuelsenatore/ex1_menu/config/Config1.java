package manuelsenatore.ex1_menu.config;

import manuelsenatore.ex1_menu.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config1 {

    @Bean
    @Scope("prototype")
    public Consumation Margherita() {
        return new ExtraPomodoroDecorator( new ExtraMozzarellaDecorator(new Pizza()));
    }

    @Bean
    @Scope("prototype")
    public Consumation MargheritaConCotto() {
        return new ExtraPomodoroDecorator( new ExtraMozzarellaDecorator(new ExtraProsciuttoDecorator(new Pizza())));
    }

    @Bean
    @Scope("prototype")
    public Consumation PizzaDelDiavolo() {
        return new ExtraPomodoroDecorator( new ExtraMozzarellaDecorator(new ExtraProsciuttoDecorator(new ExtraAnanasTopping(new Pizza()))));
    }
}
