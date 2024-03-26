package KeepOnCoding.DynamicApp.common;

import org.springframework.stereotype.Component;

@Component // Stereotype annotation that marks a Java class as a Spring component
public class BoksCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Plan your box session on tuesday.";
    }
}
