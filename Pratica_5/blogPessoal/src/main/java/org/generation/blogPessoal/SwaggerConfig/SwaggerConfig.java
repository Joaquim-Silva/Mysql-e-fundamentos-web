package org.generation.blogPessoal.SwaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()
          .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build();
    }
    private ApiInfo apiInfo(){
    	return new ApiInfoBuilder()
    	.title("Blog Pessoal")
    	.description("API do Projeto de blog pessoal")
    	.version("1.0")
    	.contact(contact())
    	.build();
    	}
    	private Contact contact(){
    	return new Contact("Diego Joaquim",
    	"https://github.com/Joaquim-Silva",
    	"Aluno full stack Angular Spring");
        
        
    }
}