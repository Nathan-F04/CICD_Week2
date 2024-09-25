package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class RequestController
{

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hi there";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return "Your name is: " + name + " and your age is: " + age;
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        int ans;
        switch (operation)
        {
            case "add":
                ans= num1+num2;
                break;
            case "subtract":
                ans= (num1-num2);
                break;
            case "divide":
                if(num2==0)
                {
                    return "You cannot divide by 0!";
                }
                else{
                    ans= num1/num2;
                }
                break;
            case "multiply":
                ans= num1*num2;
                break;
            default:
                return "You're in the default statement!";
        }
        return Integer.toString(ans);
    }
}
