package fr.hackathon.apiback.hexa.application.adapter;

import fr.hackathon.apiback.hexa.domain.Test;
import fr.hackathon.apiback.hexa.domain.ports.api.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {
    private final TestService service;

    public TestController(final TestService service) {
        this.service = service;
    }

    @PutMapping
    public ResponseEntity createTest(){
        this.service.add(new Test());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
