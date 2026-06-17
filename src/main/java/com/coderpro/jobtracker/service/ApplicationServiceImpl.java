package com.coderpro.jobtracker.service;

import com.coderpro.jobtracker.entity.Application;
import com.coderpro.jobtracker.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository repository;

    public ApplicationServiceImpl(ApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Application create(Application application) {
        return repository.save(application);
    }

    @Override
    public List<Application> getAll() {
        return repository.findAll();
    }

    @Override
    public Application getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + id));
    }

    @Override
    public Application update(Long id, Application application) {
        Application existing = getById(id);
        existing.setCompany(application.getCompany());
        existing.setRole(application.getRole());
        existing.setStatus(application.getStatus());
        existing.setAppliedDate(application.getAppliedDate());
        existing.setNotes(application.getNotes());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
