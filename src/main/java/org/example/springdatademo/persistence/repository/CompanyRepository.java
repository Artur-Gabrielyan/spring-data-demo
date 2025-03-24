package org.example.springdatademo.persistence.repository;

import org.example.springdatademo.persistence.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company findByName(String name);
}