package KeepOnCoding.DynamicApp.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component annotation marks the class as a Spring Bean
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Prototype Scope // remove to use singleton scope
// @Primary // you can also specify a primary class
public class CricketCoach implements Coach {

    // define our init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("In doMyCleanUpStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Start with 30min cardio!!!";
    }

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
