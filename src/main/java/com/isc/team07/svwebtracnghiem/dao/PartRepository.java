package com.isc.team07.svwebtracnghiem.dao;

import com.isc.team07.svwebtracnghiem.entity.Part;
import com.isc.team07.svwebtracnghiem.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartRepository extends JpaRepository<Part, Integer> {

    List<Part> findBySubject(Subject subject);
}
