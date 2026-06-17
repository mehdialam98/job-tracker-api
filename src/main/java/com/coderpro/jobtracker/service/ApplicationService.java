package com.coderpro.jobtracker.service;

import com.coderpro.jobtracker.entity.Application;
import java.util.List;

public interface ApplicationService {
    Application create(Application application);
    List<Application> getAll();
    Application getById(Long id);
    Application update(Long id, Application application);
    void delete(Long id);
}
