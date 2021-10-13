package edu.lingnan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages="edu.lingnan.controller")
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("岭梦空间接口文档")
                .description("岭梦空间设在第五教学楼4、5楼的南侧的课室，共有18间课室。目前还没投入使用，还在建设中。")
                .version("1.0.0")
                .termsOfServiceUrl("")
                //请填写项目联系人信息（名称、网址、邮箱）
                .contact(new Contact("陈世杰", "https://blog.dualseason.com/", "dualseason@qq.com"))
                .license("")
                .licenseUrl("")
                .build();
    }
}