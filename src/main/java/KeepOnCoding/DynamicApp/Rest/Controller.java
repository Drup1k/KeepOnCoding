package KeepOnCoding.DynamicApp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public  String sayHello() {

        return "This will be my main page from main method in my Dynamic Application!!!";
    }

    @GetMapping("/legday")
    public String dontSkipLeg() {
        return "Don't you ever dare to skip leg day!!";
    }

}
