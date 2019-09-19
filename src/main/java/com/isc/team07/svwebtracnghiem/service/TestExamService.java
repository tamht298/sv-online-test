package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.entity.TestExam;

import java.util.List;

public interface TestExamService {

    public List<TestExam> findAll();

    public TestExam findById(int theId);

    public void save(TestExam testExam);

    public void deleteById(int theId);

    public boolean existsById(Integer theId);
}
