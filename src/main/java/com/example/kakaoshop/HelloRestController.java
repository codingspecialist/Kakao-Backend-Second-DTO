package com.example.kakaoshop;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloRestController {

    @GetMapping("/")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("ok");
    }
}
