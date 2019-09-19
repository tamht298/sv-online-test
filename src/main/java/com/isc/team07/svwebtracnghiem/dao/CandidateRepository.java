package com.isc.team07.svwebtracnghiem.dao;

import com.isc.team07.svwebtracnghiem.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    List<Candidate> findByDeleted(boolean isDelete);
}
