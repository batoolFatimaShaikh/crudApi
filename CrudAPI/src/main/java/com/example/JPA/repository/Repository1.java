package com.example.JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.entity.Employee;

@Repository
public interface Repository1 extends JpaRepository<Employee,Long> {

}
