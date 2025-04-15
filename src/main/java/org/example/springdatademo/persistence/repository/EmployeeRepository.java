package org.example.springdatademo.persistence.repository;

import org.example.springdatademo.persistence.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmail(String email);

    boolean existsByEmail(String email);

    @Query("SELECT e.email FROM Employee e")
    Set<String> findAllEmails();
}
