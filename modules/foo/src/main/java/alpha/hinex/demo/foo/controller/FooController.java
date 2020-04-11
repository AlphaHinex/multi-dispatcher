package alpha.hinex.demo.foo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/same/path")
public class FooController {

    @GetMapping
    public String foo() {
        return "in foo controller";
    }

}
