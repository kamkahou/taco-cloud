package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    //WebMvcConfigurer定义了多个方法来配置Spring MVC，尽管只是一个接口，却提供了所有方法的默认实现，只需要我们覆盖所需的方法。在本例中，我们覆盖了addViewControllers方法。
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}
