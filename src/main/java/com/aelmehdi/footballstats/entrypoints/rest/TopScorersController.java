package com.aelmehdi.footballstats.entrypoints.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopScorersController {

    @GetMapping("top-scorers")
    String topScorers() {
        return "Top scorers";
    }
}
