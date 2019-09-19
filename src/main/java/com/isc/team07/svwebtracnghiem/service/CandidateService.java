package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.entity.Candidate;

import java.util.List;

public interface CandidateService {

    public List<Candidate> findAll();

    public Candidate findById(int theId);

    public void save(Candidate candidate);

    public void deleteById(int theId);

    boolean existsById(Integer theID);

    List<Candidate> findByDeleted(boolean isDelete);
}
