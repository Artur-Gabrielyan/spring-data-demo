package org.example.springdatademo.controller;

import lombok.RequiredArgsConstructor;
import org.example.springdatademo.persistence.repository.AddressRepository;
import org.example.springdatademo.persistence.repository.CompanyRepository;
import org.example.springdatademo.persistence.repository.EmployeeRepository;
import org.example.springdatademo.persistence.repository.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class TestController {

    private final EmployeeRepository employeeRepository;
    private final CompanyRepository companyRepository;
    private final AddressRepository addressRepository;
    private final ProjectRepository projectRepository;

    @GetMapping
    public void test() {

    }
}
