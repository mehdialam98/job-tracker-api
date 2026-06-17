package com.coderpro.jobtracker.controller;

import com.coderpro.jobtracker.entity.Application;
import com.coderpro.jobtracker.service.ApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
    private final ApplicationService service;

    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Application> create(@RequestBody Application application) {
        return new ResponseEntity<>(service.create(application), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Application> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Application getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Application update(@PathVariable Long id, @RequestBody Application application) {
        return service.update(id, application);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
