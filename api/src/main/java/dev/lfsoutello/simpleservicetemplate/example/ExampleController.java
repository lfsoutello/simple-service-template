package dev.lfsoutello.simpleservicetemplate.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class ExampleController {
    private final ExampleService exampleService;

    @GetMapping
    public String getExample() {
        return null;
    }
}
