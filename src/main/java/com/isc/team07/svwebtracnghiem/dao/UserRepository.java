package com.isc.team07.svwebtracnghiem.dao;

import com.isc.team07.svwebtracnghiem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
