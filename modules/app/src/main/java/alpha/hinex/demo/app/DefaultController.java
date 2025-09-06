package alpha.hinex.demo.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class DefaultController {

    @GetMapping
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/same/path")
    public String helloWorldWithPath(HttpServletRequest request) {
        System.out.println(request.getServletPath());
        return "hello world with path";
    }

}
