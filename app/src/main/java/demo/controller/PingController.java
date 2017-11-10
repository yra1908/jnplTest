package demo.controller;

import demo.frame.WebStartExample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public String ping () {
        try {
            return new File(WebStartExample.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return "no";
    }
}
