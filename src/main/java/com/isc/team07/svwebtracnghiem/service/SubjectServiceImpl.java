package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.dao.SubjectRepository;
import com.isc.team07.svwebtracnghiem.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    private SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject findById(int theId) {

        Optional<Subject> result = subjectRepository.findById(theId);

        Subject theSubject = null;

        if (result.isPresent()) {
            theSubject = result.get();
        } else {
            throw new RuntimeException("Did not find subject id - " + theId);
        }

        return theSubject;
    }

    @Override
    public void save(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void deleteById(int theId) {
        subjectRepository.deleteById(theId);
    }

    @Override
    public boolean existsById(Integer theId) {
        return subjectRepository.existsById(theId);
    }
}
