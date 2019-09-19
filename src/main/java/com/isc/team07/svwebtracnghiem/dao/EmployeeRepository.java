package com.isc.team07.svwebtracnghiem.dao;

import com.isc.team07.svwebtracnghiem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
