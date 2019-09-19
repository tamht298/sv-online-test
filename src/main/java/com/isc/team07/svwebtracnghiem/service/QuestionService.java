package com.isc.team07.svwebtracnghiem.service;


import com.isc.team07.svwebtracnghiem.entity.Part;
import com.isc.team07.svwebtracnghiem.entity.Question;

import java.util.List;

public interface QuestionService {

    public List<Question> findAll();

    public Question findById(int theId);

    public void save(Question question);

    public void deleteById(int theId);

    public boolean existsById(Integer theId);

    List<Question> findByDeleted(boolean isDeleted);

    List<Question> findByPart(Part part);
}
