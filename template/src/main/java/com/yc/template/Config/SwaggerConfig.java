package com.yc.template.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("first")
                .apiInfo(apiInfo())
                .select()
                //指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.yc.template.Controller"))
                .build();
    }



    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("Yc.","此处放url","此处放email");

        return new ApiInfo("Api接口文档",
                "详情",
                "1.0",
                "此处放url",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}
