package maffile.tiksocialsevice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/social")
@RestController
@RefreshScope
public class SocialController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping
    public String social(){
        return configInfo;
    }
}
