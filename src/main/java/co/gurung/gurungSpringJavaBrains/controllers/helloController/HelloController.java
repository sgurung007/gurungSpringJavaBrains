package co.gurung.gurungSpringJavaBrains.controllers.helloController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHi(){
        return "hi";
    }
}
