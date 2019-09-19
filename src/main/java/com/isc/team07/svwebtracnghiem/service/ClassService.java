package com.isc.team07.svwebtracnghiem.service;

import com.isc.team07.svwebtracnghiem.entity.Classe;

import java.util.List;

public interface ClassService {

    public List<Classe> findAll();

    public Classe findById(int theId);

    public void save(Classe classe);

    public void deleteById(int theId);

    boolean existsById(Integer theId);
}
