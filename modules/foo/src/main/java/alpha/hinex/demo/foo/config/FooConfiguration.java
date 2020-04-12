package alpha.hinex.demo.foo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("alpha.hinex.demo.foo.controller")
public class FooConfiguration implements WebMvcConfigurer {
}
