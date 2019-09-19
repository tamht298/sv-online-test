package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.entity.QuestionType;

import java.util.List;

public interface QuestionTypeService {

    public List<QuestionType> findAll();

    public QuestionType findById(int theId);

    public void save(QuestionType questionType);

    public void deleteById(int theId);

    public boolean existsById(Integer theId);
}
