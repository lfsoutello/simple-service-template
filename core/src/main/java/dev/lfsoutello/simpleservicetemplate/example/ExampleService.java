package dev.lfsoutello.simpleservicetemplate.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    public ExampleDTO create(String text) {
        Example example = new Example();
        example.setText(text);
        return new ExampleDTO(exampleRepository.save(example));
    }

    public ExampleDTO read(Long id) {
        Example example = exampleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Example not found"));
        return new ExampleDTO(example);
    }

    public ExampleDTO update(Long id, String text) {
        Example example = exampleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Example not found"));
        example.setText(text);
        return new ExampleDTO(exampleRepository.save(example));
    }

    public void delete(Long id) {
        exampleRepository.deleteById(id);
    }
}
