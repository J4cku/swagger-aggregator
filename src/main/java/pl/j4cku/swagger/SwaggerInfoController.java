package pl.j4cku.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SwaggerInfoController {

    @Autowired
    private SwaggerServicesConfig swaggerServicesConfig;

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(method = RequestMethod.GET, path = "/service/{service}")
    public Object getJson(@PathVariable String service) {
        return swaggerServicesConfig.getServices().stream()
                .filter(s -> s.getName().equalsIgnoreCase(service))
                .map(SwaggerServices::getApi)
                .map(url -> restTemplate.getForObject(url, Object.class))
                .findFirst()
                .get();
    }

}
