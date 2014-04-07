package uk.co.taidev.springbootnews.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class NewsStatusController {

    @RequestMapping("/simpleNews")
    String simpleNews() {
        return "No news is good news!";
    }


    @RequestMapping("/noNewsInfiniteLoop")
    String noNewsInfiniteLoop() {
        int i = 0;
        while (i == 0) {
            if (i == 1) {
                return "This endpoint will never return...";
            }
        }
        return "We'll never get here... :)";
    }
}