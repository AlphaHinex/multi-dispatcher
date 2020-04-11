package alpha.hinex.demo.bar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/same/path")
public class BarController {

    @GetMapping
    public String bar() {
        return "in bar controller";
    }

}

