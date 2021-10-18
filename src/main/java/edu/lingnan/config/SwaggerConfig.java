package edu.lingnan.config;

import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.collect.Lists.newArrayList;

@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages="edu.lingnan.controller")
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .globalResponseMessage(RequestMethod.GET,
                        newArrayList(new ResponseMessageBuilder()
                                        .code(500)
                                        .message("系统繁忙！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(0)
                                        .message("请求失败！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(200)
                                        .message("请求成功!")
                                        .build()))
                .globalResponseMessage(RequestMethod.POST,
                        newArrayList(new ResponseMessageBuilder()
                                        .code(500)
                                        .message("系统繁忙！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(0)
                                        .message("请求失败！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(200)
                                        .message("请求成功!")
                                        .build()))
                .globalResponseMessage(RequestMethod.DELETE,
                        newArrayList(new ResponseMessageBuilder()
                                        .code(500)
                                        .message("系统繁忙！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(0)
                                        .message("请求失败！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(200)
                                        .message("请求成功!")
                                        .build()))
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