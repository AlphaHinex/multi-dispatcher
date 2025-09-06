package alpha.hinex.demo.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class DefaultController {

    @GetMapping
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/same/path")
    public Map<String, String> helloWorldWithPath(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>(7);
        map.put("Servlet", "Default Servlet");
        map.put("URL Mapping", "/*");
        map.put("Context Path", request.getContextPath());
        map.put("Servlet Path", request.getServletPath());
        map.put("Path Info", request.getPathInfo());
        map.put("Request URI", request.getRequestURI());
        map.put("Request URL", request.getRequestURL().toString());
        return map;
    }

}
