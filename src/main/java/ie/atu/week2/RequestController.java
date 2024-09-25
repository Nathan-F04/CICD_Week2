package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class RequestController {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hi there";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Your name is: " + name;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return "Your name is: " + name + " and your age is: " + age;
    }
}
