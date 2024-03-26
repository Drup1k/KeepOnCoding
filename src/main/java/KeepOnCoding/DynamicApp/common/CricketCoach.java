package KeepOnCoding.DynamicApp.common;

import KeepOnCoding.DynamicApp.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // @Component annotation marks the class as a Spring Bean
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
