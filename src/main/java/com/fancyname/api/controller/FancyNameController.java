package com.fancyname.api.controller;
import com.fancyname.api.model.FancyNameResponse;
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
public FancyNameResponse generate(
    @RequestParam String name,
    @RequestParam(defaultValue = "default") String style,
    @RequestParam(defaultValue = "male") String gender
) {
    String result = fancyNameService.generateFancyName(name, style, gender);
    return new FancyNameResponse(name, result);
}

}
