package KeepOnCoding.DynamicApp;

import org.springframework.stereotype.Component;

@Component // @Component annotation marks the class as a Spring Bean
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Start with 30min cardio!";
    }
}
