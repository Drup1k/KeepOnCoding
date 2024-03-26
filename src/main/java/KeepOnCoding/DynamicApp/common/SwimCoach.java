package KeepOnCoding.DynamicApp.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim a 1000m as a warm up!";
    }
}
