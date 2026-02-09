package maffile.tikvideoservice.Controller;

import maffile.commommodoules.entity.Video;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/video")
public class VideoController {
    @GetMapping
    public String hello(){
        return "This is Video Controller";
    }

    @PostMapping("/search")
    public String search(@RequestBody Video video){
        return "查询成功"+video;
    }
}
