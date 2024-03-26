package KeepOnCoding.DynamicApp.common;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component annotation marks the class as a Spring Bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // remove to use singleton scope
// @Primary // you can also specify a primary class
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Start with 30min cardio!!!";
    }

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
