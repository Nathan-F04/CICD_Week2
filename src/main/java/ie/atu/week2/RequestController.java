package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping
    public String sayHello()
    {
        return "Hi there";
    }
}
