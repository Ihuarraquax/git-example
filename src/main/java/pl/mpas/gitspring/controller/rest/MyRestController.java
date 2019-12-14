package pl.mpas.gitspring.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/name")
    String myName() {
        return "mariusz";
    }

    @GetMapping("/age")
    int age() {
        return 18;
    }
}
