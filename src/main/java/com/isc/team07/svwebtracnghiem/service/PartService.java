package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.entity.Part;
import com.isc.team07.svwebtracnghiem.entity.Subject;

import java.util.List;

public interface PartService {

    public List<Part> findAll();

    public Part findById(int theId);

    public void save(Part part);

    public void deleteById(int theId);

    public boolean existsById(Integer theId);

    public List<Part> findBySubject(Subject subject);
}
