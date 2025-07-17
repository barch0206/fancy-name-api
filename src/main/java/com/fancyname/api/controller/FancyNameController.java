package com.fancyname.api.controller;

import com.fancyname.api.service.FancyNameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generate")
public class FancyNameController {

    private final FancyNameService fancyNameService;

    public FancyNameController(FancyNameService fancyNameService) {
        this.fancyNameService = fancyNameService;
    }

    @GetMapping
    public String generate(@RequestParam String name) {
        return fancyNameService.generateFancyName(name);
    }
}
