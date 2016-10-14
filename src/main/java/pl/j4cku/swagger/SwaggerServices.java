package pl.j4cku.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@ConfigurationProperties(prefix="documentation.swagger.services")
@Data
public class SwaggerServices{
    private String name;
    private String url;
    private String api;
    private String version;
}
