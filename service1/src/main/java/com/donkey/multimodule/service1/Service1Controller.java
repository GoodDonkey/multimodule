package com.donkey.multimodule.service1;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Service1Controller {
    private final Service1Service service1Service;
    
    @GetMapping("/test")
    public ResponseEntity<String> control(){
        service1Service.doThis();
        return ResponseEntity.ok("oo");
    }
}
