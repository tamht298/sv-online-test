package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.entity.Subject;

import java.util.List;

public interface SubjectService {

    public List<Subject> findAll();

    public Subject findById(int theId);

    public void save(Subject subject);

    public void deleteById(int theId);

    public boolean existsById(Integer theId);
}
