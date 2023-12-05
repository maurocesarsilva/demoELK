package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "elk")
public class ELKController {

    private final DemoRepository demoRepository;

    public ELKController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping("")
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(this.demoRepository.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> get(@RequestBody DemoJPA obj) {
        return ResponseEntity.ok(this.demoRepository.save(obj));
    }
}
