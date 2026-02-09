package maffile.tikuserservice.Controller;

import maffile.commommodoules.entity.Video;
import maffile.tikuserservice.FeignClient.VideoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private VideoFeignClient videoFeignClient;

    @GetMapping
    public String index() {
        return "This is the user service";
    }

    @PostMapping("/search")
    public String search(@RequestBody Video video) {
        return videoFeignClient.search(video);
    }
}
