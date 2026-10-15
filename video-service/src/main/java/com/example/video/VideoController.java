
package com.example.video;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @GetMapping("/videos")
    public String getVideos() {
        return "Video Service is running successfully!";
    }
}
