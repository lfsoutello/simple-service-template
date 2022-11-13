package dev.lfsoutello.simpleservicetemplate.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    public String createExample() {
        Example example = new Example();
        return null;
    }
}
