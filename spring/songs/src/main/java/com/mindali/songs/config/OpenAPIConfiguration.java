package com.mindali.songs.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class OpenAPIConfiguration {
    @Bean
    public OpenAPI defineOpenAPI(){
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("our youtube api for development, shani the queen, her husband very lucy (we will pray for him)");

        Contact myContact = new Contact();
        myContact.setName("Zeev Mindali");
        myContact.setEmail("mindalizeev@gmail.com");

        Info info = new Info()
                .title("Youtube Managment System API")
                .version("1.0")
                .description("This API exposes endpoints to youtube")
                .contact(myContact);

        return new OpenAPI().info(info).servers(List.of(server));

    }
}
