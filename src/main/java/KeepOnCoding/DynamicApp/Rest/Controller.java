package KeepOnCoding.DynamicApp.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${class.name}")
    private String className;

    // expose new endpoint for coach & team name
    @GetMapping("/class-info")
    public String getClassInfo() {
        return "Coach: " + coachName + "." + "Class info: " + className + ".";
    }


    // expose a new endpoint for main page
    @GetMapping("/")
    public String sayHello() {

        return "This will be my main page from main method in my Dynamic Application!!!";
    }

    // expose a new endpoint for "Leg day"
    @GetMapping("/leg-day")
    public String dontSkipLeg() {
        return "Don't you ever dare to skip leg day!!";
    }


}
