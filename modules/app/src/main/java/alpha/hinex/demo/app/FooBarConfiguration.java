package alpha.hinex.demo.app;

import alpha.hinex.demo.foo.config.FooConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class FooBarConfiguration {

    @Bean
    public ServletRegistrationBean fooServlet() {
        DispatcherServlet fooServlet = new DispatcherServlet();

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(FooConfiguration.class);
        fooServlet.setApplicationContext(context);

        ServletRegistrationBean<DispatcherServlet> bean = new ServletRegistrationBean<>(fooServlet, "/foo/*");
        bean.setName("Foo servlet");
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    public ServletRegistrationBean barServlet() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.scan("alpha.hinex.demo.bar");
        DispatcherServlet barServlet = new DispatcherServlet(context);
        ServletRegistrationBean<DispatcherServlet> bean = new ServletRegistrationBean<>(barServlet, "/bar/*");
        bean.setName("Bar servlet");
        bean.setLoadOnStartup(1);
        return bean;
    }

}
