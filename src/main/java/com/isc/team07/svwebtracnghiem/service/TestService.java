package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.entity.Test;

import java.util.List;

public interface TestService {

    public List<Test> findAll();

    public Test findById(int theId);

    public void save(Test test);

    public void deleteById(int theId);

    public boolean existsById(int theId);

    List<Test> findByDeleted(boolean isDeleted);
}
