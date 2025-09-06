package alpha.hinex.demo.bar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/same/path")
public class BarController {

    @GetMapping
    public String bar(HttpServletRequest request) {
        System.out.println(request.getServletPath());
        return "in bar controller";
    }

}

