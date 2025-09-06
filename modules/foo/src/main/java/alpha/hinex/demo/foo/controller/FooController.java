package alpha.hinex.demo.foo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/same/path")
public class FooController {

    @GetMapping
    public String foo(HttpServletRequest request) {
        System.out.println(request.getServletPath());
        return "in foo controller";
    }

}
