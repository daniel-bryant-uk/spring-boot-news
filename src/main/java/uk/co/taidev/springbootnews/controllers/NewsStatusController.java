package uk.co.taidev.springbootnews.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class NewsStatusController {

    @RequestMapping("/news")
    String home() {
        return "No news is good news!";
    }
}