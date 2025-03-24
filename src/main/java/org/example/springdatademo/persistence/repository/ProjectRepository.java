package org.example.springdatademo.persistence.repository;

import org.example.springdatademo.persistence.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByName(String name);
}
