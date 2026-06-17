package com.coderpro.jobtracker.repository;

import com.coderpro.jobtracker.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
