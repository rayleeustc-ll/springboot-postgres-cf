package lele.bosch.ios.config;

import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value(value ="${spring.swagger2.enabled}")
    private boolean swaggerEnabled;

    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("Get Start With a9s postgresql Database Using Spring Boot ")//标题
                        .description("demo sample of geting Start With a9s postgresql database")//描述
                        .contact(new Contact("WL", "www.test.com", "WL@test.com"))
                        .version("1.0.0")//版本号
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("lele.bosch.ios"))//scan the package
                .paths(PathSelectors.any())
                .build();
    }

    @SuppressWarnings("unchecked")
    private Predicate<String> paths() {
        return or(regex("/user/api/.*?"));
    }
}