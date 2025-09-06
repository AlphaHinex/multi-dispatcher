package alpha.hinex.demo.foo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/same/path")
public class FooController {

    @GetMapping
    public Map<String, String> foo(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>(7);
        map.put("Servlet", "Foo Servlet");
        map.put("URL Mapping", "/foo/*");
        map.put("Context Path", request.getContextPath());
        map.put("Servlet Path", request.getServletPath());
        map.put("Path Info", request.getPathInfo());
        map.put("Request URI", request.getRequestURI());
        map.put("Request URL", request.getRequestURL().toString());
        return map;
    }

}
