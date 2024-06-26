package KeepOnCoding.DynamicApp;

import KeepOnCoding.DynamicApp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Create a constructor in your class for injections
@RestController
public class DemoController {
    // Define a private field for the dependency
    private Coach myCoach;
    //private Coach anotherCoach;

    // Define a constructor for dependency (constructor injection)
    //    @Autowired // @Autowired annotation tells Spring to inject a dependency
    //    public DemoController(Coach myCoach) {
    //        this.myCoach = myCoach;
    //    }

    @Autowired
    public DemoController(@Qualifier("aqua") Coach myCoach) {
                        //@Qualifier("cricketCoach") Coach myAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
        //anotherCoach = myAnotherCoach;
    }

    // check beans scopes -> singleton or prototype (in cricketCoach setting prototype with @Scope)
    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + myCoach;
    }


    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
