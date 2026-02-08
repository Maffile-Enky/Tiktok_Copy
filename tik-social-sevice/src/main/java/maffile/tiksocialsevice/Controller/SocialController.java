package maffile.tiksocialsevice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/social")
@RestController
public class SocialController {
    @GetMapping
    public String social(){
        return "This is Social Sevice";
    }
}
