package KeepOnCoding.DynamicApp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public  String sayHello() {
        return "Hello World";
    }
}
