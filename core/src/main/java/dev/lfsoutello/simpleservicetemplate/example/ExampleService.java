package dev.lfsoutello.simpleservicetemplate.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    public Example create(Long id, String text) {
        Example example = new Example();
        example.setId(id);
        example.setText(text);
        return exampleRepository.save(example);
    }

    public Optional<Example> read(Long id) {
        return exampleRepository.findById(id);
    }

    public Example update(Long id, String text) {
        Example example = exampleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Example not found"));
        example.setText(text);
        return exampleRepository.save(example);
    }

    public void delete(Long id) {
        exampleRepository.deleteById(id);
    }
}
