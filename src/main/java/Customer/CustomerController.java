package Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/")
    public String CustomerDisplay(){
        return "Customer go here";
    }

}
