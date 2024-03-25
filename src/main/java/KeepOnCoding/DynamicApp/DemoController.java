package KeepOnCoding.DynamicApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Create a constructor in your class for injections
@RestController
public class DemoController {
    // Define a private field for the dependency

    private Coach myCoach;

    // Define a constructor for dependency (constructor injection)
    //    @Autowired // @Autowired annotation tells Spring to inject a dependency
    //    public DemoController(Coach myCoach) {
    //        this.myCoach = myCoach;
    //    }

    @Autowired
    public void setCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
