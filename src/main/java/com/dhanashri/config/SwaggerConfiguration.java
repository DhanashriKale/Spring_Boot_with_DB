package com.dhanashri.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration extends WebMvcConfigurationSupport {                                    

   @Bean
   public Docket apiMonitoramento() { 
       return new Docket(DocumentationType.SWAGGER_2)
               .select()                                  
               .apis(RequestHandlerSelectors.any())
               .paths(PathSelectors.any())                          
               .build()    
               .apiInfo(apiInfo());
   }

   private ApiInfo apiInfo() {
       return new ApiInfoBuilder()              
    		   .title("PRODUCT API DOCUMENTION")
               .description("Product Managment")
               .contact("Dhanashri - 9527985678")            
               .build();
   }

   @Override
   protected void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("swagger-ui.html")
               .addResourceLocations("classpath:/META-INF/resources/");
       registry.addResourceHandler("/webjars/**")
               .addResourceLocations("classpath:/META-INF/resources/webjars/");
   }
}
