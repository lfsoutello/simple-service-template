package dev.lfsoutello.simpleservicetemplate.example;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class ExampleController {
    private final ExampleService exampleService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExampleDTO> create(@RequestBody ExampleForm body) {
        log.info("luis");
        return ResponseEntity.ok(exampleService.create(body.getText()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExampleDTO> read(@PathVariable Long id) {
        return ResponseEntity.ok(exampleService.read(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExampleDTO> update(@PathVariable Long id, @RequestBody ExampleForm body) {
        return ResponseEntity.ok(exampleService.update(id, body.getText()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        exampleService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
