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
    public String calculate(@RequestParam float num1, @RequestParam float num2, @RequestParam String operation)
    {
        float ans;
        String operationMode;
        switch (operation)
        {
            case "add":
                operationMode="add";
                ans= num1+num2;
                break;
            case "subtract":
                operationMode="subtract";
                ans= (num1-num2);
                break;
            case "divide":
                if(num2==0)
                {
                    return "You cannot divide by 0!";
                }
                else{
                    operationMode="divide";
                    ans= num1/num2;
                }
                break;
            case "multiply":
                operationMode="multiply";
                ans= num1*num2;
                break;
            default:
                return "You're in the Default Statement!";
        }
        return "{\"operation:\" \"" + operationMode + "\", \"total:\" " + ans + "}";
    }
}
