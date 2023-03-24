package com.example.testweb.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.rsocket.RSocketProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:swagger-information.properties")
public class SwaggerConfiguration {

    @Value("${swagger.server.url}")
    private String serverUrl;

    @Value("${swagger.app-info.name}")
    private String appName;

    @Value("${swagger.app-info.description}")
    private String appDescription;

    @Value("${swagger.app-info.version}")
    private String appVersion;

    @Value("${swagger.app-info.license}")
    private String licence;

    @Value("${swagger.app-info.license-url}")
    private String licenceUrl;

    @Value("${swagger.contact.name}")
    private String contactName;

    @Value("${swagger.contact.url}")
    private String contactUrl;

    @Value("${swagger.contact.email}")
    private String contactEmail;

    @Bean
    public OpenAPI springShopOpenAPI() {
        final String securitySchemeName = "bearerAuth";
        return new OpenAPI()
                .servers()
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .name(securitySchemeName)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")))
                .info(new Info().title(appName)
                        .description(appDescription)
                        .version(appVersion)
                        .contact(new Contact().name(contactName).url(contactUrl).email(contactEmail))
                        .license(new License().name(licence).url(licenceUrl)))
                .externalDocs(new ExternalDocumentation()
                        .description(appDescription)
                        .url(contactUrl));
    }
}
