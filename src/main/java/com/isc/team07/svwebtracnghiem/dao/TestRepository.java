package com.isc.team07.svwebtracnghiem.dao;

import com.isc.team07.svwebtracnghiem.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Integer> {

    List<Test> findByDeleted(boolean isDeleted);
}
