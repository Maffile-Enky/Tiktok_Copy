package maffile.tikuserservice.FeignClient;

import maffile.commommodoules.entity.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("tik-video-service")
public interface VideoFeignClient {

    @PostMapping("/video/search")
    String search(@RequestBody Video video);
}
