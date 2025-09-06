package alpha.hinex.demo.bar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/same/path")
public class BarController {

    @GetMapping
    public Map<String, String> bar(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>(7);
        map.put("Servlet", "Bar Servlet");
        map.put("URL Mapping", "/bar/*");
        map.put("Context Path", request.getContextPath());
        map.put("Servlet Path", request.getServletPath());
        map.put("Path Info", request.getPathInfo());
        map.put("Request URI", request.getRequestURI());
        map.put("Request URL", request.getRequestURL().toString());
        return map;
    }

}

